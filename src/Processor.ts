import { User } from "./User";

export class Processor {
  static giveConsent(user: User): void {
    user.consentGiven = true;
  }
  static verifyConsent(user: User): boolean {
    return user.consentGiven === true;
  }
  static checkConsentEligibility(age: number): boolean {
    if (age < 18) {
      return false; // Age less 18
    }
    return true; // Age 18 and more
  }
  static revokeConsent(user: User): void {
    user.consentGiven = false;
  }
}
