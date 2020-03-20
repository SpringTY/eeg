// Basic
console.log(article);
var quill = new Quill('#editor-container', {
  modules: {
    toolbar: [
      [{ header: [1, 2, false] }],
      ['bold', 'italic', 'underline'],
      ['image', 'code-block']
    ]
  },
  placeholder: 'Compose an epic...',
  theme: 'snow'  // or 'bubble'
});
var articleContentsJson = article['contents']
var articleTitle = article['title']
var articleAuthority = article['authority']
var articleContents = JSON.parse(articleContentsJson)
quill.setContents(articleContents)

document.getElementById('title_q').value = articleTitle
document.getElementById('public_q').value = articleAuthority
function submitFunction() {
  console.log("TAG submitFunction")
  var contents_q = quill.getContents()
  var contents_JSON = JSON.stringify(contents_q)
  var title_q = document.getElementById('title_q').value
  var public_q =document.getElementById('public_q').value

  $.ajax({
    type: "POST",
    url: "/editArticle",
    data: {
      title: title_q,
      contents: contents_JSON,
      authority:public_q,
      articleId:articleId
    },
    dataType: "JSON",
    success: function(result) {

    }
  });
  alert('修改成功')
  window.location.href = "/articleList"
}
//
// // With Tooltip
//
//   var quill = new Quill('#quill-tooltip', {
//     modules: {
//       toolbar: '#toolbar-container'
//     },
//     placeholder: 'Compose an epic...',
//     theme: 'snow'
//   });
//
//   // Enable all tooltips
//   $('[data-toggle="tooltip"]').tooltip();
//
//   // Can control programmatically too
//   $('.ql-italic').mouseover();
//   setTimeout(function() {
//     $('.ql-italic').mouseout();
//   }, 2500);