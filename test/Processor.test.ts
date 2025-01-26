import {User} from "../src/User";
import {Processor} from "../src/Processor";

describe("Processor test", () => {
    let user:User
    beforeEach(() => {
        user = new User('Albert', 'Einstein', '123456789', 'SouthPole 28')
    })

    test("Default state undefined", () => {
        expect(user.consentGiven).toBeUndefined()
    })

    test("State is true", () => {
        Processor.giveConsent(user)
        expect(user.consentGiven).toBe(true)
    })

    test("Processor verify consent", () => {
        Processor.giveConsent(user)
        expect(Processor.verifyConsent(user)).toBeTruthy()
    })

    test("Verify consent is false", () => {
        expect(Processor.verifyConsent(user)).toBeFalsy()
    })
})

