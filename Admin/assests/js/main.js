mainFunction();

function mainFunction() {
    $('.dashboard').css({display: "block"});
    $('.managecars').css({display: "none"});
    $('.viewcustomer').css({display: "none"});

}

$('#dashboardButton').click(function () {
    $('.dashboard').css({display: "block"});
    $('.managecars').css({display: "none"});
    $('.viewcustomer').css({display: "none"});

})

$('#manageCarButton').click(function () {
    $('.dashboard').css({display: "none"});
    $('.managecars').css({display: "block"});
    $('.viewcustomer').css({display: "none"});

})

$('#viewCustomersButton').click(function () {
    $('.dashboard').css({display: "none"});
    $('.managecars').css({display: "none"});
    $('.viewcustomer').css({display: "block"});

})

$('#btnSave').click(function () {

    var today = new Date();
    var dd = String(today.getDate()).padStart(2, '0');
    var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
    var yyyy = today.getFullYear();

    today = mm + '/' + dd + '/' + yyyy;

    let registrationNo = $('#registrationNo').val();
    let brand = $('#brand').val();
    let type = $('#type').val();
    let image = $('#image').val();
    let numberOfPassengers = $('#numberOfPassengers').val();
    let transmissionType = $('#transmissionType').val();
    let fuelType = $('#fuelType').val();
    let color = $('#color').val();
    let dailyRate = $('#dailyRate').val();
    let monthlyRate = $('#monthlyRate').val();
    let freeMileagePerDay = $('#freeMileagePerDay').val();
    let freeMileagePerMonth = $('#freeMileagePerMonth').val();
    let pricePerKm = $('#pricePerKm').val();
    let kmMeterValue = $('#kmMeterValue').val();
    let lastReturnDate = today;
    let isAvailable = "YES";
    let isDamaged = "NO";
    let underMaintenance = "NO";


    let formData = new FormData();
    for (let file of document.getElementById('image').files) {
        formData.append("file", file);
    }

    formData.append("registrationNo", registrationNo);

    $.ajax({
        method: "POST",
        contentType: false,
        processData: false,
        url: "http://localhost:8080/Car_Rental/api/v1/car/uploadCarImage",
        async: true,
        data: formData,
        success: function (resp) {
            console.log(resp.data);

            if (resp.code === 200) {
                $.ajax({
                    method: "POST",
                    contentType: "application/json",
                    url: "http://localhost:8080/Car_Rental/api/v1/car/registerCar",
                    data: JSON.stringify({
                        'registrationNo': registrationNo,
                        'brand': brand,
                        'type': type,
                        'image': resp.data,
                        'numberOfPassengers': numberOfPassengers,
                        'transmissionType': transmissionType,
                        'fuelType': fuelType,
                        'color': color,
                        'dailyRate': dailyRate,
                        'monthlyRate': monthlyRate,
                        'freeMileagePerDay': freeMileagePerDay,
                        'freeMileagePerMonth': freeMileagePerMonth,
                        'pricePerKm': pricePerKm,
                        'kmMeterValue': kmMeterValue,
                        'lastReturnDate': lastReturnDate,
                        'isAvailable': isAvailable,
                        'isDamaged': isDamaged,
                        'underMaintenance': underMaintenance
                    }),
                    success: function (rt) {
                        if (rt.code === 200) {
                            console.log("Success!")
                            getAllCars();
                        } else {
                            console.log("Try again!")
                        }
                    }
                })

            }
        }
    })

});

getAllCars();
function getAllCars() {
    $.ajax({
        method:"GET",
        url:"http://localhost:8080/Car_Rental/api/v1/car",
        success:function (resp) {
            console.log(resp);
            $('#carTable>tbody').empty();

            for (let car of resp.data){
                let registrationNo=car.registrationNo;
                let brand=car.brand;
                let type=car.type;
                let image=car.image;
                let numberOfPassengers=car.numberOfPassengers;
                let transmissionType=car.transmissionType;
                let fuelType=car.fuelType;
                let color=car.color;
                let dailyRate=car.dailyRate;
                let monthlyRate=car.monthlyRate;
                let freeMileagePerDay=car.freeMileagePerDay;
                let freeMileagePerMonth=car.freeMileagePerMonth;
                let pricePerKm=car.pricePerKm;
                let kmMeterValue=car.kmMeterValue;
                let lastReturnDate=car.lastReturnDate;
                let isAvailable=car.isAvailable
                let isDamaged=car.isDamaged;
                let underMaintenance=car.underMaintenance;

                var row = `<tr><td>${registrationNo}</td><td>${brand}</td><td>${type}</td><td>${image}</td><td>${numberOfPassengers}</td><td>${transmissionType}</td><td>${fuelType}</td><td>${color}</td><td>${dailyRate}</td><td>${monthlyRate}</td><td>${freeMileagePerDay}</td><td>${freeMileagePerMonth}</td><td>${pricePerKm}</td><td>${kmMeterValue}</td><td>${lastReturnDate}</td><td>${isAvailable}</td><td>${isDamaged}</td><td>${underMaintenance}</td></tr>`;
                $('#carTable>tbody').append(row);
            }
        }

    })
}
getAllUsers();

function getAllUsers() {
    $.ajax({
        method: "GET",
        url: "http://localhost:8080/Car_Rental/api/v1/user",
        success: function (resp) {
            console.log(resp);
            $('#customerTable>tbody').empty();

            for (let user of resp.data) {
                let name = user.name;
                let nic = user.nic;
                let email = user.email;
                let password = user.password;
                let id = user.idPhoto;
                let address = user.address;
                let contact = user.contact;


                var row = `<tr><td>${name}</td><td>${nic}</td><td>${email}</td><td>${password}</td><td>${id}</td><td>${address}</td><td>${contact}</td></tr>`;
                $('#customerTable>tbody').append(row);
            }
        }

    })
}