/* ///////////////////////////////////////////////////// */
/* для 1ого выпад. списка */
var buttonText = document.querySelector("#button_text_change");
var logInputValue = document.querySelector("#text_log_name").textContent;
var nameInner;
/* Если поле юзера пусто, он не зарегин и не вошел в ЛК, то на кнопке написано "Регистрация" и action="reg",
 иначе на кнопке написано "Выход" и пересылка через action="/index"*/
if (logInputValue.length > 0) {
    nameInner = true;
    buttonText.innerHTML = "ВЫХОД";
    $(`#test`).attr('action', '/logout');
} else {
    nameInner = false;
    buttonText.innerHTML = "РЕГИСТРАЦИЯ ИЛИ ВХОД";
    $(`#test`).attr('action', '/reg');
}

/* ///////////////////////////////////////////////////// */
//https://siterost.net/post/jquery-checkbox#:~:text=Чтобы%20получить%20значение%20чекбокса%2C%20как,отфильтровать%20при%20помощи%20псевдокласса%20%3Achecked
// jQuery(document).ready(function($){
//
//     $('button').on('click', function(){
//         var values = [];
//         $('[name="first_name"]:checked').each(function(){
//             values.push($(this).val());
//         });
//
//         alert(values.join(', '));
//     });
//
// });
//
// }
function checkbox(){
    var inputElements  = document.getElementsByClassName('input_value');
    var checkedValue = new Array();
    for(var i=0; i<=inputElements.length-1;i++){
        if(inputElements[i].checked){
            checkedValue.push(inputElements[i].value);
        }
    }
}


// var expanded1 = false;

// function showCheckboxes1() {
//     var checkboxes = document.getElementById("checkboxes1");
//     if (!expanded1) {
//         checkboxes.style.display = "block";
//         expanded1 = true;
//     } else {
//         checkboxes.style.display = "none";
//         expanded1 = false;
//     }
// }
//
// /* ///////////////////////////////////////////////////// */
// /* для 2ого выпад. списка */
//
// var expanded2 = false;
//
// function showCheckboxes2() {
//     var checkboxes = document.getElementById("checkboxes2");
//     if (!expanded2) {
//         checkboxes.style.display = "block";
//         expanded2 = true;
//     } else {
//         checkboxes.style.display = "none";
//         expanded2 = false;
//     }
// }
//
// /* ///////////////////////////////////////////////////// */
// /* для 3его выпад. списка */
//
// var expanded3 = false;
//
// function showCheckboxes3() {
//     var checkboxes = document.getElementById("checkboxes3");
//     if (!expanded3) {
//         checkboxes.style.display = "block";
//         expanded3 = true;
//     } else {
//         checkboxes.style.display = "none";
//         expanded3 = false;
//     }
// }
//
// /* ///////////////////////////////////////////////////// */
//
//
// document.addEventListener("DOMContentLoaded", () => {
//     const checkBoxAll = document.querySelectorAll('input[type=checkbox]');
//     console.log('checkBoxAll', checkBoxAll);
// })

/* ///////////////////////////////////////////////////// */

// code for form registration !!!!!
// Получить модель
// var modal = document.getElementById('id01');

// Когда пользователь щелкает в любом месте за пределами модального, закройте его
// window.onclick = function (event) {
//     if (event.target == modal) {
//         modal.style.display = "none";
//     }
// }

/* /////////////////////////////////////////////////////    TEST   NEW */

// $(document).ready(function () {
//     $("#pass, #pass2").keyup(validate);
// });

