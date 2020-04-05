// plans = [{
//     planname:'读《乌合之众》',
//     planid:'2'
// }]
function insertPlans(plans) {
    let options = '<option value="-1">'+'无计划'+'</option>'
    for (let i = 0; i < plans.length; i++) {
        options = options + '<option value="'+plans[i]['planid']+'">'+plans[i]['planname']+'</option>'
    }
    console.log(options);
    let select = $('#planList');
    select.html(options)
}

function startMethod() {
    $.ajax({
            type: "GET",
            url: "/getPlans",
            success: function (plans) {
                insertPlans(plans)
            }
        }
    )

}
startMethod()

function submitEEGFile() {
    let filePath = $('#EEGFile')[0].files[0] //document.getElementById('EEGFile').files[0]
    let info = document.getElementById('info').value;
    let uploadDate = document.getElementById('uploadDate').value;
    let planId = document.getElementById('planList').value;
    let fileTitle = document.getElementById('fileTitle').value;
    // let EEGFile = new FormData();
    // EEGFile.append('EEGFile',filePath)
    alert("正在处理中")
    var EEGFile = new FormData($("#fileInfo")[0]);
    $.ajax({
            type: "POST",
            url: "/uploadEEGFile",
        contentType: false, // 注意这里应设为false
        processData: false,
        cache: false,
        data: EEGFile,

        // processData: false, // 告诉jQuery不要去处理发送的数据
        // contentType: false, // 告诉jQuery不要去设置Content-Type请求头
            success: function (res) {
                window.location.href = "/fileAnalysisResult/"+res
            }
        }
    )
}

