/* ///////////////////////////////////////////////////// */
/* для 1ого выпад. списка */
var buttonText = document.querySelector("#button_text_change");
var logInputValue = document.querySelector("#text_log_name").textContent;
var nameInner;
if (logInputValue.length > 0) {
    nameInner = true;
    buttonText.innerHTML = "ВЫХОД";
} else {
    nameInner = false;
    buttonText.innerHTML = "РЕГИСТРАЦИЯ";
}
// function replaceNameButton() {
//     if (nameInner) {
//
//     } if(!nameInner){
//
//     }
//
// }

var expanded1 = false;

function showCheckboxes1() {
    var checkboxes = document.getElementById("checkboxes1");
    if (!expanded1) {
        checkboxes.style.display = "block";
        expanded1 = true;
    } else {
        checkboxes.style.display = "none";
        expanded1 = false;
    }
}

/* ///////////////////////////////////////////////////// */
/* для 2ого выпад. списка */

var expanded2 = false;

function showCheckboxes2() {
    var checkboxes = document.getElementById("checkboxes2");
    if (!expanded2) {
        checkboxes.style.display = "block";
        expanded2 = true;
    } else {
        checkboxes.style.display = "none";
        expanded2 = false;
    }
}

/* ///////////////////////////////////////////////////// */
/* для 3его выпад. списка */

var expanded3 = false;

function showCheckboxes3() {
    var checkboxes = document.getElementById("checkboxes3");
    if (!expanded3) {
        checkboxes.style.display = "block";
        expanded3 = true;
    } else {
        checkboxes.style.display = "none";
        expanded3 = false;
    }
}

/* ///////////////////////////////////////////////////// */


document.addEventListener("DOMContentLoaded", () => {
    const checkBoxAll = document.querySelectorAll('input[type=checkbox]');
    console.log('checkBoxAll', checkBoxAll);
})

/* ///////////////////////////////////////////////////// */

// code for form registration !!!!!
// Получить модель
var modal = document.getElementById('id01');

// Когда пользователь щелкает в любом месте за пределами модального, закройте его
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

/* /////////////////////////////////////////////////////    TEST   NEW */

$(document).ready(function () {
    $("#pass, #pass2").keyup(validate);
});

function validate() {
    var pass1 = $("#psw").val();
    var pass2 = $("#psq-repeat").val();

    if (pass1 == pass2) {
        $("#sw").text("Пароли совпадают");
    } else {
        $("#sw").text("Пароли не совпадают");
    }
}