
document.getElementById('form_1').style.display='none'
function search_to_database() {
    var username = document.getElementById('username').value
    var userPhone = document.getElementById('userPhone').value
    console.log(username);
    console.log(userPhone);
    $.ajax({
        type: "POST",
        url: "/searchUsers",
        data: {
            username: username,
            userPhone: userPhone,
        },
        dataType: "JSON",
    });
}
function display_to_form() {

}