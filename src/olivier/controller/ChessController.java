package olivier.controller;

import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import olivier.model.Piece;
import olivier.model.Plateau;


import java.lang.reflect.Array;
import java.net.URL;
import java.util.ResourceBundle;

public class ChessController implements Initializable {

    @FXML
    TextField textFieldPlayer;
    @FXML
    Button boutonAnnuler;
    @FXML
    Button boutonNew;
    @FXML
    Button boutonQuit;
    @FXML
    GridPane chessGrid;
    @FXML
    ImageView case0_0, case1_0, case2_0, case3_0, case4_0, case5_0, case6_0, case7_0,
              case0_1, case1_1, case2_1, case3_1, case4_1, case5_1, case6_1, case7_1,
              case0_2, case1_2, case2_2, case3_2, case4_2, case5_2, case6_2, case7_2,
              case0_3, case1_3, case2_3, case3_3, case4_3, case5_3, case6_3, case7_3,
              case0_4, case1_4, case2_4, case3_4, case4_4, case5_4, case6_4, case7_4,
              case0_5, case1_5, case2_5, case3_5, case4_5, case5_5, case6_5, case7_5,
              case0_6, case1_6, case2_6, case3_6, case4_6, case5_6, case6_6, case7_6,
              case0_7, case1_7, case2_7, case3_7, case4_7, case5_7, case6_7, case7_7;

    // Initialisation de l'échiquier FRONT
    private ImageView[][] cases;

    // Initialisation de l'échiquier BACK
    private Plateau plateau;

    // Initialisation de la première image cliquée
    private ImageView firstImageViewClicked;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        plateau = new Plateau();

        cases = new ImageView[8][8];
        cases[0] = new ImageView[] {case0_0, case1_0, case2_0, case3_0, case4_0, case5_0, case6_0, case7_0};
        cases[1] = new ImageView[] {case0_1, case1_1, case2_1, case3_1, case4_1, case5_1, case6_1, case7_1};
        cases[2] = new ImageView[] {case0_2, case1_2, case2_2, case3_2, case4_2, case5_2, case6_2, case7_2};
        cases[3] = new ImageView[] {case0_3, case1_3, case2_3, case3_3, case4_3, case5_3, case6_3, case7_3};
        cases[4] = new ImageView[] {case0_4, case1_4, case2_4, case3_4, case4_4, case5_4, case6_4, case7_4};
        cases[5] = new ImageView[] {case0_5, case1_5, case2_5, case3_5, case4_5, case5_5, case6_5, case7_5};
        cases[6] = new ImageView[] {case0_6, case1_6, case2_6, case3_6, case4_6, case5_6, case6_6, case7_6};
        cases[7] = new ImageView[] {case0_7, case1_7, case2_7, case3_7, case4_7, case5_7, case6_7, case7_7};

        updateUI();

        chessGrid.setOnMouseClicked((e) -> {

            ImageView target = (ImageView) e.getTarget();

            if (firstImageViewClicked == null) {
                if (target.getImage().getUrl() != null) {
                    firstImageViewClicked = target;
                }
            } else {
                target.setImage(firstImageViewClicked.getImage());
                firstImageViewClicked.setImage(null);
                firstImageViewClicked = null;
            }
            // A utiliser pour le model
            //int row = GridPane.getRowIndex(target);
            //int col = GridPane.getColumnIndex(target);
        });
    }

    // Méthode qui distribuer les ImagesView sur l'échiquier FRONT
    // S'appuie sur la disposition des pièces définie dans la classe Plateau
    private void updateUI() {
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8 ; j++) {
                if (plateau.getPlateau() [i][j] != null) {
                    Piece piece = plateau.getPlateau() [i][j];
                    cases [j][i].setImage(new Image(piece.getImage()));
                }
            }
        }
    }
}

