package com.perfecto.sample.test;

import java.util.List;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class flipkartHomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "search.box")
	private QAFWebElement searchBox;
	@FindBy(locator = "list.of.mobiles")
	private List<QAFWebElement> listOfMobiles;
	@FindBy(locator = "search.box.enter")
	private QAFWebElement searchBoxEnter;
	@FindBy(locator = "search.click")
	private QAFWebElement searchClick;
	@FindBy(locator = "add.yo.cart")
	private QAFWebElement addYoCart;
	@FindBy(locator = "product.details")
	private QAFWebElement productDetails;
	@FindBy(locator = "remove.product")
	private QAFWebElement removeProduct;
	@FindBy(locator = "remove.popup")
	private QAFWebElement removePopup;
	@FindBy(locator = "verify.cart.empty")
	private QAFWebElement verifyCartEmpty;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getSearchBox() {
		return searchBox;
	}

	public List<QAFWebElement> getListOfMobiles() {
		return listOfMobiles;
	}

	public QAFWebElement getSearchBoxEnter() {
		return searchBoxEnter;
	}

	public QAFWebElement getSearchClick() {
		return searchClick;
	}

	public QAFWebElement getAddYoCart() {
		return addYoCart;
	}

	public QAFWebElement getProductDetails() {
		return productDetails;
	}

	public QAFWebElement getRemoveProduct() {
		return removeProduct;
	}

	public QAFWebElement getRemovePopup() {
		return removePopup;
	}

	public QAFWebElement getVerifyCartEmpty() {
		return verifyCartEmpty;
	}

}
