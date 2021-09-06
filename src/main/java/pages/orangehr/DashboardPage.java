package pages.orangehr;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;
import pages.base.BasePage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static pages.base.MyICnstants.*;


public class DashboardPage extends BasePage {
    SelenideElement employeeDistribution = $(By.id("dashboard__employeeDistribution"));
    ElementsCollection tableOfDashboard = $$(By.xpath("//div[@id='panel_wrapper_1']/div/fieldset"));
    SelenideElement distributionLegend = $(By.id("div_graph_display_emp_distribution_legend"));
    SelenideElement taskList = $(By.xpath("//div[@id='task-list-group-panel-menu_holder']"));
    SelenideElement tablePending = $(By.id("panel_draggable_1_2"));
    SelenideElement tableTotal = $("#total > table > tbody");
    ElementsCollection legendBox = $$(By.xpath("//tr/td[1]/div[1]/div[1]"));
    ElementsCollection imgQuickLaunch = $$(By.xpath("//td/div[1]/a[1]/img[1]"));
    ElementsCollection elementsQuickLaunch = $$(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]//tr/td"));


    public void comparisonQuickLaunch(){
        for(int i =0; i<getElementsQuickLaunch().size(); i++){
            existenceElement(DATA_QUICKLAUNCH.get(i)).should(exist);

        }
    }
    public void comparisonImgQuickLaunch(){
        for(int i =0; i<getElementsQuickLaunch().size(); i++){
            getImgQuickLaunch().get(i).shouldBe(visible);
        }
    }
    public void comparisonTablePage(){
        for(int i =0, j=0; i<getTableOfDashboard().size(); i++,j++){
            getTableOfDashboard().get(i)
                    .shouldHave(text(TABLE_PAGE.get(j)));
        }
    }
    public void comparisonLegend(){
        for(int i =0; i<getLegendBox().size(); i++) {
            existenceLegendElement(TABLE_LEGEND.get(i)).should(exist);
        }}

    public void comparisonImgLegend(){
        for(int i =0; i<getLegendBox().size(); i++){
            getLegendBox().get(i).shouldBe(visible);
        }
    }

    public void comparisonsTable(){
        getEmployeeDistribution().should(exist);
        getDistributionLegend().should(hidden);
        getTablePending().should(exist);
        getTableTotal().should(exist);
        getTaskList().should(exist);
    }



    public SelenideElement existenceElement(String str) {
        return $(By.xpath("//span[contains(text(),\'" + str + "\')]"));
    }


    public SelenideElement existenceLegendElement(String str) {
        return $(By.xpath("//td[contains(text(),\'" + str + "\')]"));
    }


    public SelenideElement getEmployeeDistribution() {
        return employeeDistribution;
    }


    public ElementsCollection getTableOfDashboard() {
        return tableOfDashboard;
    }


    public SelenideElement getDistributionLegend() {
        return distributionLegend;
    }


    public SelenideElement getTaskList() {
        return taskList;
    }


    public SelenideElement getTablePending() {
        return tablePending;
    }


    public SelenideElement getTableTotal() {
        return tableTotal;
    }


    public ElementsCollection getLegendBox() {
        return legendBox;
    }


    public ElementsCollection getImgQuickLaunch() {
        return imgQuickLaunch;
    }


    public ElementsCollection getElementsQuickLaunch() {
        return elementsQuickLaunch;
    }

}
