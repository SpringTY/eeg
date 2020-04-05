

function eSenseAttention(id,attentionData) {
    let myChart = echarts.init(document.getElementById(id));
    option = {
        xAxis: {
            type: 'category',
            //data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
        },
        yAxis: {
            type: 'value'
        },
        series: [{
            data: attentionData,
            type: 'line',
            smooth: true
        }]
    };

    myChart.setOption(option);
}

function drawAttentionBar(id,barData) {
    let myChart = echarts.init(document.getElementById(id));
    option = {
        color: ['#3398DB'],
        tooltip: {
            trigger: 'axis',
            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: [
            {
                type: 'category',
                data: ['0-20', '20-40', '40-60', '60-80', '80-100'],
                axisTick: {
                    alignWithLabel: true
                }
            }
        ],
        yAxis: [
            {
                type: 'value'
            }
        ],
        series: [
            {
                name: '直接访问',
                type: 'bar',
                barWidth: '60%',
                data: barData
            }
        ]
    };

    myChart.setOption(option);
}
function attentionPie(id,pieData) {
    let myChart = echarts.init(document.getElementById(id));
    let data = {
        legendData: ['专注时间', '非专注时间'],
        seriesData: [
            {name: '专注时间', value: pieData['attentionTime']},
            {name: '非专注时间', value: pieData['unAttentionTime']}
        ],
        selected: [true, true]
    };
    option = {
        title: {
            text: '',
            left: 'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b} : {c} ({d}%)'
        },
        legend: {
            type: 'scroll',
            orient: 'vertical',
            right: 10,
            // top: 20,
            // bottom: 20,
            data: data.legendData,

            selected: data.selected
        },
        series: [
            {
                name: '姓名',
                type: 'pie',
                radius: '55%',
                center: ['40%', '50%'],
                data: data.seriesData,
                emphasis: {
                    itemStyle: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    myChart.setOption(option)

}
function initRawValue() {
    let titleInfo = '<h3>文件：'+eegFileInfo['note']+'</h3>'
    +'<br/>'
    +'<h5>上传时间：'+eegFileInfo['uploaddate'].substring(0,10)+'</h5>'
    +'<h5>总阅读时间：'+eegFileInfo['totaltime']+' min </h5>'
    +'<h5>专注阅读时间：'+eegFileInfo['attentiontime']+' min</h5>'
    +'<h5 href="#">对应计划：阅读朝花夕拾</h5>'
        +'<br/>'
    +'<h5>文件描述信息:</h5>'
    +'<br/>'
    +'<p>'+eegFileInfo['info']+'</p>'
    $('#fileTitle').html(titleInfo)
    //
}
initRawValue()