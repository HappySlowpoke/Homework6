export class User {
  name: string;
  surname: string;
  phoneNumber: string;
  address: string;
  age: number;
  consentGiven: boolean | undefined;

  constructor(
    name: string,
    surname: string,
    phoneNumber: string,
    address: string,
    age: number,
  ) {
    this.name = name;
    this.address = address;
    this.surname = surname;
    this.phoneNumber = phoneNumber;
    this.age = age;
  }
}
