/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 $(function () {
        $("#btn").click(function () {
            var password = $("#password").val();
            var confirmPassword = $("#confirm").val();
            if (password !== confirmPassword) {
                alert("Whoops,passwords don't match");
                
                return false;
            }
            return true;
        });
    });