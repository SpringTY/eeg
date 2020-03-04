document.write("<script type='text/javascript' src='../assets/js/echarts.js'></script>");
document.write("<script src='https://unpkg.com/axios/dist/axios.min.js'></script>")
document.write('header("Access-Control-Allow-Origin:*");\n' +
    'header("Access-Control-Allow-Methods:GET,POST");')
var host = 'localhost'
var port = '8080'
var server = host + ':' + port + '/'
console.log("drawGraph.js TAG");

function getVirtulData(year) {
    year = year || '2020';
    var date = +echarts.number.parseDate(year + '-01-01');
    var end = +echarts.number.parseDate((+year + 1) + '-01-01');
    var dayTime = 3600 * 24 * 1000;
    var data = [];
    for (var time = date; time < end; time += dayTime) {
        data.push([
            echarts.format.formatTime('yyyy-MM-dd', time),
            Math.floor(Math.random() * 24 * 60)
        ]);
    }
    return data;
}

function drawCalendarGraph(id) {
    var myChart = echarts.init(document.getElementById(id));


    option = {
        tooltip: {},
        visualMap: {
            min: 0,
            max: 24 * 60,
            type: 'piecewise',
            orient: 'horizontal',
            left: 'center',
            top: 0,
            textStyle: {
                color: '#000'
            }
        },
        calendar: {
            top: 60,
            left: 30,
            right: 30,
            cellSize: ['auto', 20],
            range: '2020',
            itemStyle: {
                borderWidth: 0.5
            },
            yearLabel: {show: false},
            dayLabel: {
                nameMap: 'cn'
            }
        },
        series: {
            type: 'heatmap',
            coordinateSystem: 'calendar',
            data: getVirtulData(2020)
        }
    }
    myChart.setOption(option);
}

function drawLastWeek(id) {
    var myChart = echarts.init(document.getElementById(id));
    var attentionTime = {
        name: '专注时间',
        type: 'line',
        stack: '总量',
        data: null

    }
    var totalTime = {
        name: '总时间',
        type: 'line',
        stack: '总量',
        data: null
    }
    attentionTime.data = [120, 132, 101, 134, 90, 230, 210]
    totalTime.data = [120, 132, 101, 134, 90, 230, 210]
    option = {
        title: {
            text: 'Last Week Review'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: ['专注时间', '总时间']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
        },
        yAxis: {
            type: 'value'
        },
        series: [
            attentionTime,
            totalTime
        ]
    };
    myChart.setOption(option);
}

function drawLastWeekConstitute(id) {
    var myChart = echarts.init(document.getElementById(id));
    var lastWeekValue = getLastWeekConstitute()
    var data = {
        legendData: ['专注时间', '非专注时间'],
        seriesData: [
            {name: '专注时间', value: lastWeekValue['attentionTime']},
            {name: '非专注时间', value: lastWeekValue['unAttentionTime']}
        ],
        selected: [true, true]
    };
    option = {
        title: {
            text: '上周学习时间',
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

function getLastWeekConstitute() {
    var constitute = null
    $.ajax({
            type: "GET",
            url: "getLastWeek",
            async: false,
            success: function (result) {
                constitute = result
            }
        }
    )
    // console.log(constitute);
    // console.log(constitute['unAttentionTime']);
    // console.log(constitute['attentionTime']);
    return constitute
}

// getLastWeekConstitute()
// console.log(a);