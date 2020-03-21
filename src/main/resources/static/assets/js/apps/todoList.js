$('.input-search').on('keyup', function() {
    var rex = new RegExp($(this).val(), 'i');
    $('.todo-box .todo-item').hide();
    $('.todo-box .todo-item').filter(function() {
        return rex.test($(this).text());
    }).show();
});
var plans = null

$.ajax({
        type: "POST",
        url: "/getPlans",
        async: false,
        success: function (result) {
            plans = result
        }
    }
)
for (let i = 0; i < plans.length; i++) {
    plans[i]['date'] = plans[i]['plandate']
    plans[i]['title'] = plans[i]['planname']
    plans[i]['description'] = plans[i]['plandescription']
}
// document.write("编辑")
var item_title =plans
var test = [
    {
        title :"文章标题",
        date : '2020-02-02',
        description:'计划完成\n毕业设计',
        finished: "true",
        important: "true",
        trash: "false",
        planid: 2,
        plantime:12,
        realtime:4
    },
    {
        title :"文章标题",
        date : '2020-02-02',
        description:'计划完成毕业设计',
        finished: "true",
        important: "true",
        trash: "false",
        planid:1,
        plantime:2,
        realtime:2
    }
]
function writeDone(plan){
    var planType = 'todo-item'
    var importantType = '添加至星标'
    var finished = ''
    plan.title = plan.title +'(目标专注时间: '+plan['plantime']+'h,已经专注时间: '+plan['realtime']+'h)'
    if(plan['trash'] == 'true'){
        planType = planType + ' todo-task-trash'
    }else{
        planType = planType + ' all-list'
        if(plan['finished'] == 'true'){
            planType = planType +' todo-task-done'

            finished ='checked'
        }
        if(plan['important']=='true'){
            plan.title =  '★ '+plan.title
            planType = planType +' todo-task-important'
            importantType = '取消星标'
        }
    }
    console.log(planType);
    return '<div class="'+planType+'">\n' +
        '                                            <div class="todo-item-inner">\n' +

        '                                                <div class="n-chk text-center">\n' +
                                                            '<input type="hidden" class="planid"  value="'+plan['planid']+'">'+
        '                                                    <label class="new-control new-checkbox checkbox-primary">\n' +

        '                                                      <input type="checkbox" '+finished+' class="new-control-input inbox-chkbox" ">\n' +
        '                                                      <span class="new-control-indicator"></span>\n' +
        '                                                    </label>\n' +
        '                                                </div>\n' +
        '\n' +
        '                                                <div class="todo-content">\n' +
        '                                                    <h5 class="todo-heading" data-todoHeading="'+plan['title']+'"> '+plan['title']+'</h5>\n' +
        '                                                    <p class="meta-date">'+plan['date']+'</p>\n' +
        '                                                    <p class="todo-text" data-todoHtml="<p>'+plan['description']+'</p>" data-todoText=\'{"ops":[{"insert":"'+plan['description']+'\\n"}]}\'> '+plan['description']+'</p>\n' +
        '                                                </div>\n' +
        '\n' +
        // '                                                <div class="priority-dropdown custom-dropdown-icon">\n' +
        // '                                                    <div class="dropdown p-dropdown">\n' +
        // '                                                        <a class="dropdown-toggle warning" href="#" role="button" id="dropdownMenuLink-5" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">\n' +
        // '                                                            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-alert-octagon"><polygon points="7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"></polygon><line x1="12" y1="8" x2="12" y2="12"></line><line x1="12" y1="16" x2="12" y2="16"></line></svg>\n' +
        // '                                                        </a>\n' +
        // '                                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuLink-5">\n' +
        // '                                                            <a class="dropdown-item danger" href="javascript:void(0);"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-alert-octagon"><polygon points="7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"></polygon><line x1="12" y1="8" x2="12" y2="12"></line><line x1="12" y1="16" x2="12" y2="16"></line></svg> High</a>\n' +
        // '                                                            <a class="dropdown-item warning" href="javascript:void(0);"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-alert-octagon"><polygon points="7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"></polygon><line x1="12" y1="8" x2="12" y2="12"></line><line x1="12" y1="16" x2="12" y2="16"></line></svg> Middle</a>\n' +
        // '                                                            <a class="dropdown-item primary" href="javascript:void(0);"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-alert-octagon"><polygon points="7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"></polygon><line x1="12" y1="8" x2="12" y2="12"></line><line x1="12" y1="16" x2="12" y2="16"></line></svg> Low</a>\n' +
        // '                                                        </div>\n' +
        // '                                                    </div>\n' +
        // '                                                </div>\n' +
        '\n' +
        '                                                <div class="action-dropdown custom-dropdown-icon">\n' +
        '                                                    <div class="dropdown">\n' +
        '                                                        <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink-6" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">\n' +
        '                                                            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-more-vertical"><circle cx="12" cy="12" r="1"></circle><circle cx="12" cy="5" r="1"></circle><circle cx="12" cy="19" r="1"></circle></svg>\n' +
        '                                                        </a>\n' +
        '                                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuLink-6">\n' +
                                                                    '<input type="hidden" class="planid"  value="'+plan['planid']+'">'+
        '                                                            <a class="important dropdown-item" >'+importantType+'</a>\n' +
        '                                                            <a class="dropdown-item delete">暂时中断</a>\n' +
        '                                                            <a class="dropdown-item permanent-delete" >永久删除</a>\n' +
        '                                                            <a class="dropdown-item revive">恢复计划</a>\n' +
        '                                                        </div>\n' +
        '                                                    </div>\n' +
        '                                                </div>\n' +
        '\n' +
        '                                            </div>\n' +
        '                                        </div>'
}
function writePlans(plans) {
    var plansHtml = ''
    for (let i = 0; i < plans.length; i++) {
        plansHtml = plansHtml+ writeDone(plans[i])
    }
    $('#ct').html(plansHtml)
}
writePlans(item_title)

function remotePost(url,planId) {
    $.ajax({
            type: "POST",
            url: '/'+url+'/'+planId
        }
    )
}
function donePlan(planId) {
    remotePost('finishPlan',planId)
    //alert("done:"+planId)
}
function undonePlan(planId) {
    remotePost('unFinishPlan',planId)
}
function makeImportant(planId) {
    remotePost('importantPlan',planId)
}
function makeUnImportant(planId) {
    remotePost('unimportantPlan',planId)
}
function revive(planId) {
    remotePost('revivePlan',planId)
}
function deleteToTrash(planId) {
    remotePost('trashPlan',planId)
}
function deletePlanPermanently(planId) {
    remotePost('deletePlanPermanently',planId)
}
const taskViewScroll = new PerfectScrollbar('.task-text', {
    wheelSpeed:.5,
    swipeEasing:!0,
    minScrollbarLength:40,
    maxScrollbarLength:300,
    suppressScrollX : true
});
function dynamicBadgeNotification( setTodoCategoryCount ) {
    var todoCategoryCount = setTodoCategoryCount;

    // Get Parents Div(s)
    var get_ParentsDiv = $('.todo-item');
    var get_TodoAllListParentsDiv = $('.todo-item.all-list');
    var get_TodoCompletedListParentsDiv = $('.todo-item.todo-task-done');
    var get_TodoImportantListParentsDiv = $('.todo-item.todo-task-important');

    // Get Parents Div(s) Counts
    var get_TodoListElementsCount = get_TodoAllListParentsDiv.length;
    var get_CompletedTaskElementsCount = get_TodoCompletedListParentsDiv.length;
    var get_ImportantTaskElementsCount = get_TodoImportantListParentsDiv.length;

    // Get Badge Div(s)
    var getBadgeTodoAllListDiv = $('#all-list .todo-badge');
    var getBadgeCompletedTaskListDiv = $('#todo-task-done .todo-badge');
    var getBadgeImportantTaskListDiv = $('#todo-task-important .todo-badge');


    if (todoCategoryCount === 'allList') {
        if (get_TodoListElementsCount === 0) {
            getBadgeTodoAllListDiv.text('');
            return;
        }
        if (get_TodoListElementsCount > 9) {
            getBadgeTodoAllListDiv.css({
                padding: '2px 0px',
                height: '25px',
                width: '25px'
            });
        } else if (get_TodoListElementsCount <= 9) {
            getBadgeTodoAllListDiv.removeAttr('style');
        }
        getBadgeTodoAllListDiv.text(get_TodoListElementsCount);
    }
    else if (todoCategoryCount === 'completedList') {
        if (get_CompletedTaskElementsCount === 0) {
            getBadgeCompletedTaskListDiv.text('');
            return;
        }
        if (get_CompletedTaskElementsCount > 9) {
            getBadgeCompletedTaskListDiv.css({
                padding: '2px 0px',
                height: '25px',
                width: '25px'
            });
        } else if (get_CompletedTaskElementsCount <= 9) {
            getBadgeCompletedTaskListDiv.removeAttr('style');
        }
        getBadgeCompletedTaskListDiv.text(get_CompletedTaskElementsCount);
    }
    else if (todoCategoryCount === 'importantList') {
        if (get_ImportantTaskElementsCount === 0) {
            getBadgeImportantTaskListDiv.text('');
            return;
        }
        if (get_ImportantTaskElementsCount > 9) {
            getBadgeImportantTaskListDiv.css({
                padding: '2px 0px',
                height: '25px',
                width: '25px'
            });
        } else if (get_ImportantTaskElementsCount <= 9) {
            getBadgeImportantTaskListDiv.removeAttr('style');
        }
        getBadgeImportantTaskListDiv.text(get_ImportantTaskElementsCount);
    }
}

new dynamicBadgeNotification('allList');
new dynamicBadgeNotification('completedList');
new dynamicBadgeNotification('importantList');

/*
  ====================
    Quill Editor
  ====================
*/

var quill = new Quill('#taskdescription', {
    modules: {
        toolbar: null
    },
    placeholder: '请在此输入计划描述...',
    theme: 'snow'  // or 'bubble'
});

$('#addTaskModal').on('hidden.bs.modal', function (e) {
    // do something...
    $(this)
        .find("input,textarea,select")
        .val('')
        .end();

    quill.deleteText(0, 2000);
})
$('.mail-menu').on('click', function(event) {
    $('.tab-title').addClass('mail-menu-show');
    $('.mail-overlay').addClass('mail-overlay-show');
})
$('.mail-overlay').on('click', function(event) {
    $('.tab-title').removeClass('mail-menu-show');
    $('.mail-overlay').removeClass('mail-overlay-show');
})
$('#addTask').on('click', function(event) {
    event.preventDefault();

    $('.add-tsk').show();
    $('.edit-tsk').hide();
    $('#addTaskModal').modal('show');
    const ps = new PerfectScrollbar('.todo-box-scroll', {
        suppressScrollX : true
    });
});
const ps = new PerfectScrollbar('.todo-box-scroll', {
    suppressScrollX : true
});

const todoListScroll = new PerfectScrollbar('.todoList-sidebar-scroll', {
    suppressScrollX : true
});

function checkCheckbox() {
    $('.todo-item input[type="checkbox"]').click(function() {
        let planId = $(this).parent().parent().children()[0].value
        if ($(this).is(":checked")) {

            donePlan(planId)
            $(this).parents('.todo-item').addClass('todo-task-done');
        }
        else if ($(this).is(":not(:checked)")) {
            undonePlan(planId)
            $(this).parents('.todo-item').removeClass('todo-task-done');
        }
        new dynamicBadgeNotification('completedList');
    });
}

function deleteDropdown() {

    $('.action-dropdown .dropdown-menu .delete.dropdown-item').click(function() {
        if(!$(this).parents('.todo-item').hasClass('todo-task-trash')) {
            let planId = $(this).parent().children()[0].value
            deleteToTrash(planId)
            var getTodoParent = $(this).parents('.todo-item');
            var getTodoClass = getTodoParent.attr('class');

            var getFirstClass = getTodoClass.split(' ')[1];
            var getSecondClass = getTodoClass.split(' ')[2];
            var getThirdClass = getTodoClass.split(' ')[3];

            if (getFirstClass === 'all-list') {
                getTodoParent.removeClass(getFirstClass);
            }
            if (getSecondClass === 'todo-task-done' || getSecondClass === 'todo-task-important') {
                getTodoParent.removeClass(getSecondClass);
            }
            if (getThirdClass === 'todo-task-done' || getThirdClass === 'todo-task-important') {
                getTodoParent.removeClass(getThirdClass);
            }
            $(this).parents('.todo-item').addClass('todo-task-trash');
        } else if($(this).parents('.todo-item').hasClass('todo-task-trash')) {
            $(this).parents('.todo-item').removeClass('todo-task-trash');
        }
        new dynamicBadgeNotification('allList');
        new dynamicBadgeNotification('completedList');
        new dynamicBadgeNotification('importantList');
    });
}
function deletePermanentlyDropdown() {
    $('.action-dropdown .dropdown-menu .permanent-delete.dropdown-item').on('click', function(event) {
        event.preventDefault();
        if(confirm("永久删除不可恢复,是否继续?")){
            let planId = $(this).parent().children()[0].value
            deletePlanPermanently(planId)
            if($(this).parents('.todo-item').hasClass('todo-task-trash')) {
                $(this).parents('.todo-item').remove();
            }
        }else{

        }

    });
}

function reviveMailDropdown() {
    $('.action-dropdown .dropdown-menu .revive.dropdown-item').on('click', function(event) {
        event.preventDefault();
        let planId = $(this).parent().children()[0].value
        if($(this).parents('.todo-item').hasClass('todo-task-trash')) {
            revive(planId);
            var getTodoParent = $(this).parents('.todo-item');
            var getTodoClass = getTodoParent.attr('class');
            var getFirstClass = getTodoClass.split(' ')[1];
            $(this).parents('.todo-item').removeClass(getFirstClass);
            $(this).parents('.todo-item').addClass('all-list');
            $(this).parents('.todo-item').hide();
        }
        new dynamicBadgeNotification('allList');
        new dynamicBadgeNotification('completedList');
        new dynamicBadgeNotification('importantList');
    });
}
var test2  = null
function importantDropdown() {
    $('.important').click(function() {
        let planId = $(this).parent().children()[0].value
        if(!$(this).parents('.todo-item').hasClass('todo-task-important')){
            makeImportant(planId)
            $(this).parents('.todo-item').addClass('todo-task-important');
            $(this).html('Back to List');
        }
        else if($(this).parents('.todo-item').hasClass('todo-task-important')){
            makeUnImportant(planId)
            $(this).parents('.todo-item').removeClass('todo-task-important');
            $(this).html('Important');
            $(".list-actions#all-list").trigger('click');
        }
        new dynamicBadgeNotification('importantList');
    });
}

function priorityDropdown() {
    $('.priority-dropdown .dropdown-menu .dropdown-item').on('click', function(event) {

        var getClass = $(this).attr('class').split(' ')[1];
        var getDropdownClass = $(this).parents('.p-dropdown').children('.dropdown-toggle').attr('class').split(' ')[1];
        $(this).parents('.p-dropdown').children('.dropdown-toggle').removeClass(getDropdownClass);

        $(this).parents('.p-dropdown').children('.dropdown-toggle').addClass(getClass);
    })
}

function editDropdown() {
    $('.action-dropdown .dropdown-menu .edit.dropdown-item').click(function() {

        event.preventDefault();

        var $_outerThis = $(this);

        $('.add-tsk').hide();
        $('.edit-tsk').show();

        var $_taskTitle = $_outerThis.parents('.todo-item').children().find('.todo-heading').attr('data-todoHeading');
        var $_taskText = $_outerThis.parents('.todo-item').children().find('.todo-text').attr('data-todoText');
        var $_taskJson = JSON.parse($_taskText);
        // POINT 2 GET
        $('#task').val($_taskTitle);
        quill.setContents($_taskJson);

        $('.edit-tsk').off('click').on('click', function(event) {
            var $_innerThis = $(this);
            var $_task = document.getElementById('task').value;
            var $_taskDescription = document.getElementById('taskdescription').value;

            var today = new Date();
            var dd = String(today.getDate()).padStart(2, '0');
            var mm = String(today.getMonth()); //January is 0!
            var yyyy = today.getFullYear();
            var monthNames = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ];

            today = monthNames[mm] + ', ' + dd + ' ' + yyyy;


            var $_taskDescriptionText = quill.getText();
            var $_taskDescriptionInnerHTML = quill.root.innerHTML;

            var delta = quill.getContents();
            var $_textDelta = JSON.stringify(delta);

            var length = 125;

            var trimmedString = $_taskDescriptionText.length > length ?
                $_taskDescriptionText.substring(0, length - 3) + "..." :
                $_taskDescriptionText;

            var $_taskEditedTitle = $_outerThis.parents('.todo-item').children().find('.todo-heading').html($_task);
            var $_taskEditedText = $_outerThis.parents('.todo-item').children().find('.todo-text').html(trimmedString);
            var $_taskEditedText = $_outerThis.parents('.todo-item').children().find('.meta-date').html(today);

            var $_taskEditedTitleDataAttr = $_outerThis.parents('.todo-item').children().find('.todo-heading').attr('data-todoHeading', $_task);
            var $_taskEditedTextDataAttr = $_outerThis.parents('.todo-item').children().find('.todo-text').attr('data-todoText', $_textDelta);
            var $_taskEditedTextDataAttr = $_outerThis.parents('.todo-item').children().find('.todo-text').attr('data-todoHtml', $_taskDescriptionInnerHTML);
            $('#addTaskModal').modal('hide');
        })
        $('#addTaskModal').modal('show');
    })
}

function todoItem() {
    $('.todo-item .todo-content').on('click', function(event) {
        event.preventDefault();

        var $_taskTitle = $(this).find('.todo-heading').attr('data-todoHeading');
        var $todoHtml = $(this).find('.todo-text').attr('data-todoHtml');

        $('.task-heading').text($_taskTitle);
        $('.task-text').html($todoHtml);

        $('#todoShowListItem').modal('show');
    });
}
var $btns = $('.list-actions').click(function() {
    if (this.id == 'all-list') {
        var $el = $('.' + this.id).fadeIn();
        $('#ct > div').not($el).hide();
    } else if (this.id == 'todo-task-trash') {
        var $el = $('.' + this.id).fadeIn();
        $('#ct > div').not($el).hide();
    } else {
        var $el = $('.' + this.id).fadeIn();
        $('#ct > div').not($el).hide();
    }
    $btns.removeClass('active');
    $(this).addClass('active');
})

checkCheckbox();
deleteDropdown();
deletePermanentlyDropdown();
reviveMailDropdown();
importantDropdown();
priorityDropdown();
editDropdown();
todoItem();
var description_
$(".add-tsk").click(function(){

    console.log(document.getElementById('task').value)
    var planTitle = document.getElementById('task').value
    var important = document.getElementById('important').value
    var attentionTime = document.getElementById('attentionTime').value
    var description = quill.getContents()["ops"][0]["insert"]

    $.ajax({
            type: "POST",
            url: "/newPlan",
            data: {
                planTitle: planTitle,
                description: description,
                attentionTime: attentionTime,
                important:important
            },
            success: function (result) {
                window.location.href = '/planList'
            }
        }
    )
    var today = new Date();
    var dd = String(today.getDate()).padStart(2, '0');
    var mm = String(today.getMonth()); //January is 0!
    var yyyy = today.getFullYear();
    var monthNames = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ];

    today = monthNames[mm] + ', ' + dd + ' ' + yyyy;
    var $_task = document.getElementById('task').value;
    $_task = $_task +'(目标专注时间: '+attentionTime+'h,已经专注时间: 0h)'
    var $_taskDescriptionText = quill.getText();
    var $_taskDescriptionInnerHTML = quill.root.innerHTML;

    var delta = quill.getContents();
    description_ =delta
    var $_textDelta = JSON.stringify(delta);

    $html = '<div class="todo-item all-list">'+
        '<div class="todo-item-inner">'+
        '<div class="n-chk text-center">'+
        '<label class="new-control new-checkbox checkbox-primary">'+
        '<input type="checkbox" class="new-control-input inbox-chkbox">'+
        '<span class="new-control-indicator"></span>'+
        '</label>'+
        '</div>'+

        '<div class="todo-content">'+
        '<h5 class="todo-heading" data-todoHeading="'+$_task+'"> '+$_task+'</h5>'+
        '<p class="meta-date">'+today+'</p>'+
        "<p class='todo-text' data-todoHtml='"+$_taskDescriptionInnerHTML+"' data-todoText='"+$_textDelta+"'> "+$_taskDescriptionText+"</p>"+
        '</div>'+

        '<div class="priority-dropdown">'+
        '<div class="dropdown p-dropdown">'+
        '<a class="dropdown-toggle primary" href="#" role="button" id="dropdownMenuLink-4" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">'+
        '<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-alert-octagon"><polygon points="7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"></polygon><line x1="12" y1="8" x2="12" y2="12"></line><line x1="12" y1="16" x2="12" y2="16"></line></svg>'+
        '</a>'+

        '<div class="dropdown-menu" aria-labelledby="dropdownMenuLink-4">'+
        '<a class="dropdown-item danger" href="javascript:void(0);"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-alert-octagon"><polygon points="7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"></polygon><line x1="12" y1="8" x2="12" y2="12"></line><line x1="12" y1="16" x2="12" y2="16"></line></svg> High</a>'+
        '<a class="dropdown-item warning" href="javascript:void(0);"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-alert-octagon"><polygon points="7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"></polygon><line x1="12" y1="8" x2="12" y2="12"></line><line x1="12" y1="16" x2="12" y2="16"></line></svg> Middle</a>'+
        '<a class="dropdown-item primary" href="javascript:void(0);"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-alert-octagon"><polygon points="7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"></polygon><line x1="12" y1="8" x2="12" y2="12"></line><line x1="12" y1="16" x2="12" y2="16"></line></svg> Low</a>'+
        '</div>'+
        '</div>'+
        '</div>'+

        '<div class="action-dropdown">'+
        '<div class="dropdown">'+
        '<a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink-4" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">'+
        '<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-more-vertical"><circle cx="12" cy="12" r="1"></circle><circle cx="12" cy="5" r="1"></circle><circle cx="12" cy="19" r="1"></circle></svg>'+
        '</a>'+

        '<div class="dropdown-menu" aria-labelledby="dropdownMenuLink-4">'+
        '<a class="important dropdown-item" href="javascript:void(0);">Important</a>'+
        '<a class="dropdown-item delete" href="javascript:void(0);">Delete</a>'+
        '<a class="dropdown-item permanent-delete" href="javascript:void(0);">Permanent Delete</a>'+
        '<a class="dropdown-item revive" href="javascript:void(0);">Revive Task</a>'+
        '</div>'+
        '</div>'+
        '</div>'+

        '</div>'+
        '</div>';


    $("#ct").prepend($html);
    $('#addTaskModal').modal('hide');
    checkCheckbox();
    deleteDropdown();
    deletePermanentlyDropdown();
    reviveMailDropdown();
    editDropdown();
    priorityDropdown();
    todoItem();
    importantDropdown();
    new dynamicBadgeNotification('allList');
    $(".list-actions#all-list").trigger('click');
});

$('.tab-title .nav-pills a.nav-link').on('click', function(event) {
    $(this).parents('.mail-box-container').find('.tab-title').removeClass('mail-menu-show')
    $(this).parents('.mail-box-container').find('.mail-overlay').removeClass('mail-overlay-show')
})

// Validation Process

var $_getValidationField = document.getElementsByClassName('validation-text');

getTaskTitleInput = document.getElementById('task');

getTaskTitleInput.addEventListener('input', function() {

    getTaskTitleInputValue = this.value;

    if (getTaskTitleInputValue == "") {
        $_getValidationField[0].innerHTML = 'Title Required';
        $_getValidationField[0].style.display = 'block';
    } else {
        $_getValidationField[0].style.display = 'none';
    }
})

getTaskDescriptionInput = document.getElementById('taskdescription');

getTaskDescriptionInput.addEventListener('input', function() {

    getTaskDescriptionInputValue = this.value;

    if (getTaskDescriptionInputValue == "") {
        $_getValidationField[1].innerHTML = 'Description Required';
        $_getValidationField[1].style.display = 'block';
    } else {
        $_getValidationField[1].style.display = 'none';
    }

})