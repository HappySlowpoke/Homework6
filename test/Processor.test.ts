import { User } from "../src/User";
import { Processor } from "../src/Processor";

describe("Processor test", () => {
  let user: User;
  let user2: User;
  beforeEach(() => {
    user = new User("Albert", "Einstein", "123456789", "SouthPole 28", 16);
    user2 = new User("Vasya", "Pupkin", "9876543210", "SouthPole 28", 25);
  });

  test("Default state undefined", () => {
    expect(user.consentGiven).toBeUndefined();
  });

  test("State is true", () => {
    Processor.giveConsent(user);
    expect(user.consentGiven).toBe(true);
  });

  test("Processor verify consent", () => {
    Processor.giveConsent(user);
    expect(Processor.verifyConsent(user)).toBeTruthy();
  });

  test("Verify consent is false", () => {
    expect(Processor.verifyConsent(user)).toBeFalsy();
  });

  test("Verify check consent eligibility under age", () => {
    expect(Processor.checkConsentEligibility(user.age)).toBeFalsy();
  });

  test("Verify check consent eligibility over age", () => {
    expect(Processor.checkConsentEligibility(user2.age)).toBeTruthy();
  });

  test("Revoke consent works correctly", () => {
    expect(Processor.revokeConsent(user2)).toBeFalsy();
  });

});
