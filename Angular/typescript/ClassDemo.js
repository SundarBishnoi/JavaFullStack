var Associate = /** @class */ (function () {
    function Associate(associateId, firstName, lastName, basicSalary) {
        this.associateId = associateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = basicSalary;
    }
    Associate.prototype.calculateTotalSalary = function () {
        this.hra = this.basicSalary * 10 / 100;
        this.ta = this.basicSalary * 7 / 100;
        this.da = this.basicSalary * 6 / 100;
        this.totalSalary = this.basicSalary + this.hra + this.da + this.ta;
    };
    Associate.prototype.toString = function () {
        return this.associateId + " " + this.firstName + " " + this.lastName + " " + this.basicSalary;
    };
    return Associate;
}());
var associateList = new Array(3);
associateList[0] = new Associate(101, "Sundar", "Bishnoi", 15000);
associateList[1] = new Associate(102, "Lal", "Bishnoi", 20000);
associateList[2] = new Associate(103, "Suresh", "Bishnoi", 25000);
associateList.forEach(function (associate) {
    associate.calculateTotalSalary();
    console.log(associate.toString());
});
