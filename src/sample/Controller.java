package sample;

import dao.PreguntaDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import modelo.Pregunta;

import javax.swing.*;
import java.io.File;

public class Controller {
    private String urlImagenes="C:\\Users\\Ivan Cabrera O\\Desktop\\ivan\\Segundo Nocturno\\Programación\\Leas V2\\src\\imgPreguntas\\";
    private int numPregunta=0;
    private int isExist=0;

    @FXML
    private Button btnPregunta1;

    @FXML
    private Button btnPregunta2;

    @FXML
    private Button btnPregunta3;

    @FXML
    private Button btnPregunta4;

    @FXML
    private Button btnPregunta5;

    @FXML
    private TextArea txtdescripcion;

    @FXML
    private RadioButton chkBlue1;

    @FXML
    private ToggleGroup opciones;

    @FXML
    private TextField txtBlue1;

    @FXML
    private TextField txtBlueUrl;

    @FXML
    private ImageView imgBlue1;

    @FXML
    private RadioButton chkRed2;

    @FXML
    private TextField txtRed1;

    @FXML
    private TextField txtRedUrl;

    @FXML
    private ImageView imgRed1;

    @FXML
    private RadioButton chkYellow1;

    @FXML
    private TextField txtYellow1;

    @FXML
    private TextField txtYellowUrl;

    @FXML
    private ImageView imgYellow1;

    @FXML
    private RadioButton chkGreen1;

    @FXML
    private TextField txtGreen1;

    @FXML
    private TextField txtGreenUrl;

    @FXML
    private ImageView imgGreen1;

    @FXML
    private Button btnGuardar;

    @FXML
    private AnchorPane imgDescripcion;

    @FXML
    private ImageView logo;

    @FXML
    void oneClicGuardar(ActionEvent event) {
        //()
        PreguntaDao preguntadao = new PreguntaDao();
        if(isExist==0) {
            if (!txtdescripcion.getText().isEmpty()) {
                Pregunta pregunta = new Pregunta(txtdescripcion.getText(), txtBlue1.getText(), txtRed1.getText(), txtYellow1.getText(), txtGreen1.getText(),
                        txtBlueUrl.getText(), txtRedUrl.getText(), txtYellowUrl.getText(), txtGreenUrl.getText(),
                        chkBlue1.isSelected(), chkRed2.isSelected(), chkYellow1.isSelected(), chkGreen1.isSelected(),
                        1, numPregunta);
                preguntadao.insertarPregunta(pregunta);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: Llene el campo de la pregunta");
            }
        }else{
            Pregunta pregunta = new Pregunta(isExist,txtdescripcion.getText(), txtBlue1.getText(), txtRed1.getText(), txtYellow1.getText(), txtGreen1.getText(),
            txtBlueUrl.getText(), txtRedUrl.getText(), txtYellowUrl.getText(), txtGreenUrl.getText(),
            chkBlue1.isSelected(), chkRed2.isSelected(), chkYellow1.isSelected(), chkGreen1.isSelected(),
            1, numPregunta);
            preguntadao.actualizarPregunta(pregunta);

        }
    }

    @FXML
    void seleccionarPregunta(ActionEvent event) {
        isExist=0;
        if(event.getSource()==btnPregunta1){
            numPregunta=1;
           cargarDatos(1, numPregunta);
        }
        if(event.getSource()==btnPregunta2){
            numPregunta=2;

            cargarDatos(1, numPregunta);
        }
        if(event.getSource()==btnPregunta3){
            numPregunta=3;

            cargarDatos(1, numPregunta);

        }

        if(event.getSource()==btnPregunta4){
            numPregunta=4;
            cargarDatos(1, numPregunta);
        }
        if(event.getSource()==btnPregunta5){
            numPregunta=5;
            cargarDatos(1, numPregunta);
        }
    }

    void cargarDatos(int cuestionaoId, int numPregunta){
        txtdescripcion.setText("");
        imgBlue1.setImage(null);
        imgRed1.setImage(null);
        imgYellow1.setImage(null);
        imgGreen1.setImage(null);
        txtBlueUrl.setText(null);
        txtRedUrl.setText(null);
        txtYellowUrl.setText(null);
        txtGreenUrl.setText(null);
        txtBlue1.setText(null);
        txtRed1.setText(null);
        txtYellow1.setText(null);
        txtGreen1.setText(null);
        PreguntaDao preguntaDao= new PreguntaDao();
        Pregunta pregunta =new Pregunta();

        pregunta = preguntaDao.findOne(cuestionaoId,numPregunta);
       if(pregunta!=null) {
           isExist=pregunta.getId();
           txtdescripcion.setText(pregunta.getDescripcion());

           txtBlue1.setText(pregunta.getOptionBlueTxt());
           txtRed1.setText(pregunta.getOptionRedTxt());
           txtYellow1.setText(pregunta.getOptionYellowTxt());
           txtGreen1.setText(pregunta.getOptionGreenTxt());
           txtBlueUrl.setText(pregunta.getOptionBlueUrl());
           txtRedUrl.setText(pregunta.getOptionRedUrl());
           txtYellowUrl.setText(pregunta.getOptionYellowUrl());
           txtGreenUrl.setText(pregunta.getOptionGreenUrl());
           chkBlue1.setSelected(pregunta.getOptionBlue());
           chkRed2.setSelected(pregunta.getOptionRed());
           chkYellow1.setSelected(pregunta.getOptionYellow());
           chkGreen1.setSelected(pregunta.getOptionGreen());

           File fileBlue = new File(urlImagenes + pregunta.getOptionBlueUrl());
           Image imageBlue = new Image(fileBlue.toURI().toString());
           imgBlue1.setImage(imageBlue);

           File fileRed = new File(urlImagenes + pregunta.getOptionRedUrl());
           Image imageRed = new Image(fileRed.toURI().toString());
           imgRed1.setImage(imageRed);

           File fileYellow = new File(urlImagenes + pregunta.getOptionYellowUrl());
           Image imageYellow = new Image(fileYellow.toURI().toString());
           imgYellow1.setImage(imageYellow);

           File fileGreen = new File(urlImagenes + pregunta.getOptionGreenUrl());
           Image imageGreen = new Image(fileGreen.toURI().toString());
           imgGreen1.setImage(imageGreen);
       }
    }
}
