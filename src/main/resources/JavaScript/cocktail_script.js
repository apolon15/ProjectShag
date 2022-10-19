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


document.addEventListener("DOMContentLoaded", () => {
  const checkBoxAll = document.querySelectorAll('input[type=checkbox]');
  console.log('checkBoxAll', checkBoxAll);
//   checkBoxAll.forEach(elem => {
//     elem.checked ? console.log('checkBoxAll value', elem) : NaN;
//   })
})

