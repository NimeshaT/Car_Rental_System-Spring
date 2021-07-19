hideAll();
$('#log1').css({display: "block"});



$('#home').click(function () {
    hideAll();
    $('#log1').css({display: "block"});

});

$('#myAccountButton').click(function () {
   hideAll();
    $('#account').css({display: "block"});


});
$('#rentalReqButton').click(function () {
    hideAll();
    $('#rentalreq').css({display: "block"});

});

$('#carDetailsButton').click(function () {
    hideAll();
    $('#cardetals2').css({display: "block"});


});


$('#rentStatusButton').click(function () {
    hideAll();
    $('#status').css({display: "block"});

});
function hideAll() {
    $("#log1,#status,#rentalreq,#account,#cardetals2").css('display', 'none');
}
// getAllCars();
// $('#loginBtn').click(function () {
//     let NIC = $('#nic').val();
//     let password = $('#password').val();
//
//     $.ajax({
//         method: "GET",
//         url: "http://localhost:8080/RegUser/api/v1/user/",
//         async: true,
//         success:function (resp) {
//             console.log(resp.data);
//             if (resp.data!=null){
//                 if(resp.data==password) {
//                     console.log("ela")
//                     loadRegUserDetails();
//                     // showTopButtons();
//                     // requestStatusTableDataLoad();
//
//                 }else {
//                     confirm("Wrong Password Or User Name");
//                 }
//             }else {
//                 confirm("Your Request Pending!");
//             }
//         }
//
//     });
//
//
// });
// function loadRegUserDetails() {
//     $('.login-section').css({display: "none"});
//     $('.rental-section').css({display: "none"});
//     $('.car-details-section').css({display: "block"});
//     $('.myAccount-section').css({display: "none"});
//     $('.rental-status-section').css({display: "none"});
// }




