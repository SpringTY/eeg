

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
attenTiondata = [820, 932, 901, 934, 1290, 1330, 1320]
eSenseAttention('eSenseAttention',attenTiondata)