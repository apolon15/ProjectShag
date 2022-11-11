function validate() {

    function ValidMail() {
        var re = /^[\w-\.]+@[\w-]+\.[a-z]{2,4}$/i;
        var myMail = $(`#form_mail`).val();
        var valid = re.test(myMail);
        // if (!valid) {
        //     alert('Адрес эл. почты введен правильно!');
        // }
        // else output = 'Адрес электронной почты введен неправильно!';
        // document.getElementById('message').innerHTML = output;
        return valid;
    }

    if ($(`#form_name`).val() == "") {
        alert("Вы не указали имя")
        $(`form.modal-content`).attr({action: "/reg", method: "get"})
    } else if (!ValidMail()) {
        alert("Не указан либо не верно указан Email")
        $(`form.modal-content`).attr({action: "/reg", method: "get"})
    } else if ($(`#form_pass`).val() != $(`#form_pass_rep`).val()) {
        alert("Пароли не совпадают");
        $(`form.modal-content`).attr({action: "/reg", method: "get"})
    } else {
        $(`form.modal-content`).attr({action: "/save/user", method: "post"})
    }
}