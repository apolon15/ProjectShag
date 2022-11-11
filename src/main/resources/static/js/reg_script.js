function validate() {
    if ($(`#form_pass`).val() != $(`#form_pass_rep`).val()) {
        alert("Пароли не совпадают");
        $(`form.modal-content`).attr({action: "/reg", method: "get"})
    } else if ($(`#form_mail`).val() == "") {
        alert("Вы не указади почту")

    } else if ($(`#form_name`).val() == "") {
        alert("Вы не указали имя")
    } else {
        $(`form.modal-content`).attr({action: "/save/user", method: "post"})
    }
}