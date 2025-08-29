let year = 2000;

let isLeapYear = year % 400 === 0 || (year % 4 === 0 && year % 100 !== 0);

console.log(isLeapYear);
