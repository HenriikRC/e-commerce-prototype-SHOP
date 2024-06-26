module SHOP.Shop{
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    requires org.json;
    requires org.apache.commons.text;
    requires org.controlsfx.controls;
    requires postgresql;
    requires json.simple;


    opens SHOP.Shop to javafx.fxml;
    exports SHOP.Shop;
}