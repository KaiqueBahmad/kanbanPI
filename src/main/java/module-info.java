module pi.kanban {
    requires javafx.controls;
    requires javafx.fxml;

    opens pi.kanban to javafx.fxml;
    exports pi.kanban;
}
