$('document').ready(function () {
           $("#alert").hide();
           $("body").keydown(function(event) {
               if (event.keyCode == "13") {
                  $('#login').click();
               }
           });
           $('#login').on('click',function(){
               $("#alert").hide();
               if ($('#name').val() == ""){
                   $('#alert').text('请输入姓名');
                   $('#alert').show();
               }else {
                   login({
                       userName:$('#name').val()
                   });
               }
           });
        });

        function login(user) {
            
//            console.log("---------当前页---------------"+defaultArg.page+"---------------------");
            $.ajax({
                url: "user/login",
                type: "GET",
                dataType: "json",
                data: user,
                success: function (status) {
                    if ( status == 'success' ){
                        window.location.href="main.html";
                    } else{
                        $('#alert').text(status);
                        $('#alert').show();
                    }
                }
            });
        }