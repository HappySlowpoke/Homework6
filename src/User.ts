export class User {
    name:string
    surname: string
    phoneNumber: string
    address: string
    consentGiven: boolean | undefined

    constructor(name:string, surname: string, phoneNumber: string, address: string) {
    this.name = name
        this.address = address
        this.surname = surname
        this.phoneNumber = phoneNumber

    }
}