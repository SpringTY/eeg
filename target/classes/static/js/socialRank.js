all_work();

function all_work() {
    getRecentPlans()
    getPlanStatistic()
    getLastWeekRank()
    getPlanRank()
//
}

function writePlanRank(ranks) {
    let ranksHtml = ''
    let rank = null
    for (let i = 0; i < ranks.length; i++) {
        rank = ranks[i]
        ranksHtml = ranksHtml + ' <tr>\n' +
            '                                            <td><div class="td-content product-brand">' + i + '</div></td>\n' +
            '                                            <td><div class="td-content">' + rank['username'] + '</div></td>\n' +
            '                                            <td><div class="td-content pricing"><span class="">' + rank['finished'] + '</span></div></td>\n' +
            '                                            <td><div class="td-content pricing"><span class="">' + rank['trash'] + '</span></div></td>\n' +
            '                                            <td><div class="td-content pricing"><span class="">' + rank['realtime'] + '</span></div></td>\n' +
            '                                        </tr>'
    }
    $('#planRank').html(ranksHtml)
}

function getPlanRank() {
    $.ajax({
            type: "GET",
            url: "/getFriendsPlanRank",
            success: function (res) {
                writePlanRank(res)
            }
        }
    )
}

function writeLastWeekRank(weekRanks) {
    let weekRank = null
    let rankHtml = ''
    for (let i = 0; i < weekRanks.length; i++) {
        weekRank = weekRanks[i]
        rankHtml = rankHtml + '   <tr><td><div class="td-content figure">' + i + '</div></td>\n' +
            '                                                <td><div class="td-content">' + weekRank['username'] + '</div></td>\n' +
            '                                                <td><div class="td-content pricing"><span class="">' + weekRank['attention'] + '</span></div></td>\n' +
            '                                                <td><div class="td-content pricing"><span class="">' + weekRank['total'] + '</span></div></td>\n </tr>' +
            '                                           '
    }
    $('#lastWeekRank'
    ).html(rankHtml)
}

function getLastWeekRank() {
    $.ajax({
            type: "GET",
            url: "/getFriendsWeekRank",
            success: function (res) {
                writeLastWeekRank(res)
            }
        }
    )
}

function writeRecentFourPlans(plans) {
    // console.log(plans);
    let planHtml = ''
    let plan = null
    let process = 0
    for (let i = 0; i < plans.length; i++) {
        plan = plans[i]
        process = plan['realtime'] / plan['plantime']
        process = Math.ceil(process * 100)
        if (process > 100) process = 100
        // console.log(process);
        planHtml = planHtml + '<div class="browser-list">\n' +
            '                                    <div class="w-browser-details">\n' +
            '\n' +
            '                                        <div class="w-browser-info">\n' +
            '                                            <h6>' + plan['planname'] + '</h6>\n' +
            '                                            <p class="browser-count">' + process + '%</p>\n' +
            '                                        </div>\n' +
            '\n' +
            '                                        <div class="w-browser-stats">\n' +
            '                                            <div class="progress">\n' +
            '                                                <div class="progress-bar bg-gradient-primary" role="progressbar" style="width: ' + process + '%" aria-valuenow="15" aria-valuemin="0" aria-valuemax="100"></div>\n' +
            '                                            </div>\n' +
            '                                        </div>\n' +
            '\n' +
            '                                    </div>\n' +
            '\n' +
            '                                </div>'

    }
    $('#plansList').html(planHtml)
}

function writeRecentSixPlans(plans) {
    let planHtml = ''
    let plan = null
    //
    // console.log(plans);
    for (let i = 0; i < plans.length; i++) {
        plan = plans[i]
        planHtml = planHtml + '<div class="item-timeline timeline-new">\n' +
            '                                        <div class="t-dot" data-original-title="" title="">\n' +
            '                                        </div>\n' +
            '                                        <div class="t-text">\n' +
            '                                            <p><span>' + plan['plandate'].substring(0, 11) + '计划：' + plan['planname'] + '\n' +
            '                                        </div>\n' +
            '                                    </div>'
    }
    $('#timeline').html(planHtml)
}

function getRecentPlans() {
    $.ajax({
            type: "GET",
            url: "/getRecentPlans",
            success: function (res) {
                let recentFour
                let recentSix
                if (res > 4) recentFour = res.subarray(0, 4)
                else recentFour = res
                if (res > 6) recentSix = res.subarray(0, 6)
                else recentSix = res
                writeRecentFourPlans(recentFour)
                writeRecentSixPlans(recentSix)
            }
        }
    )
}

function writePlanStatistic(planStatistics) {
    console.log(planStatistics);
    let planStatsHtml = '  <p class="task-left">1</p>\n' +
        '                                    <p><span> </span></p><p><span> </span></p>\n' +
        '                                    <p class=""><span>已完成计划：' + planStatistics['finished'] + '个</span></p>\n' +
        '                                    <p class="task-completed"><span>星标计划：' + planStatistics['important'] + '个</span></p>\n' +
        '\n' +
        '                                    <p class="todo-task-done"><span>累计专注时间：' + (planStatistics['realtime'] / 60).toFixed(2) + ' 小时</span></p>\n' +
        '                                    <p class="task-hight-priority"><span>废弃计划：' + planStatistics['trash'] + ' 个</span> </p>\n' +
        '                               '
    $('#planStats').html(planStatsHtml)
}

function getPlanStatistic() {
    $.ajax({
            type: "GET",
            url: "/getLastWeekStatistic",
            success: function (res) {
                writePlanStatistic(res)
            }
        }
    )

}