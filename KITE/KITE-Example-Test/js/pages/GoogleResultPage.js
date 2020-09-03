const {By, until} = require('selenium-webdriver');

const elements = {
  result: By.id('hello'),
}

class GoogleResultPage {
  constructor(driver) {
    this.driver = driver;
  }

  async openFirstResult() {
    let result = await this.driver.wait(until.elementLocated(elements.result), 2000);
    await result.click();
  }

  async getTitle() {
    return await this.driver.getTitle();
  }

}
module.exports = GoogleResultPage
