package modelo;

public class Pregunta {

    private int id;
    private String descripcion;
    private String optionBlueTxt;
    private String optionRedTxt;
    private String optionYellowTxt;
    private String optionGreenTxt;
    private String optionBlueUrl;
    private String optionRedUrl;
    private String optionYellowUrl;
    private String optionGreenUrl;
    private Boolean optionBlue;
    private Boolean optionRed;
    private Boolean optionYellow;
    private Boolean optionGreen;
    private int cuestionario_id;
    private int numPregunta;

    //Constructores


    public Pregunta(int id, String descripcion, String optionBlueTxt, String optionRedTxt, String optionYellowTxt, String optionGreenTxt,
                    String optionBlueUrl, String optionRedUrl, String optionYellowUrl, String optionGreenUrl,
                    Boolean optionBlue, Boolean optionRed, Boolean optionYellow, Boolean optionGreen, int cuestionario_id, int numPregunta) {
        this.id = id;
        this.descripcion = descripcion;
        this.optionBlueTxt = optionBlueTxt;
        this.optionRedTxt = optionRedTxt;
        this.optionYellowTxt = optionYellowTxt;
        this.optionGreenTxt = optionGreenTxt;
        this.optionBlueUrl = optionBlueUrl;
        this.optionRedUrl = optionRedUrl;
        this.optionYellowUrl = optionYellowUrl;
        this.optionGreenUrl = optionGreenUrl;
        this.optionBlue = optionBlue;
        this.optionRed = optionRed;
        this.optionYellow = optionYellow;
        this.optionGreen = optionGreen;
        this.cuestionario_id = cuestionario_id;
        this.numPregunta = numPregunta;
    }

    public Pregunta(String descripcion, String optionBlueTxt, String optionRedTxt, String optionYellowTxt, String optionGreenTxt,
                    String optionBlueUrl, String optionRedUrl, String optionYellowUrl, String optionGreenUrl,
                    Boolean optionBlue, Boolean optionRed, Boolean optionYellow, Boolean optionGreen, int cuestionario_id, int numPregunta) {
        this.descripcion = descripcion;
        this.optionBlueTxt = optionBlueTxt;
        this.optionRedTxt = optionRedTxt;
        this.optionYellowTxt = optionYellowTxt;
        this.optionGreenTxt = optionGreenTxt;
        this.optionBlueUrl = optionBlueUrl;
        this.optionRedUrl = optionRedUrl;
        this.optionYellowUrl = optionYellowUrl;
        this.optionGreenUrl = optionGreenUrl;
        this.optionBlue = optionBlue;
        this.optionRed = optionRed;
        this.optionYellow = optionYellow;
        this.optionGreen = optionGreen;
        this.cuestionario_id = cuestionario_id;
        this.numPregunta = numPregunta;
    }

    public Pregunta() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOptionBlueTxt() {
        return optionBlueTxt;
    }

    public void setOptionBlueTxt(String optionBlueTxt) {
        this.optionBlueTxt = optionBlueTxt;
    }

    public String getOptionRedTxt() {
        return optionRedTxt;
    }

    public void setOptionRedTxt(String optionRedTxt) {
        this.optionRedTxt = optionRedTxt;
    }

    public String getOptionYellowTxt() {
        return optionYellowTxt;
    }

    public void setOptionYellowTxt(String optionYellowTxt) {
        this.optionYellowTxt = optionYellowTxt;
    }

    public String getOptionGreenTxt() {
        return optionGreenTxt;
    }

    public void setOptionGreenTxt(String optionGreenTxt) {
        this.optionGreenTxt = optionGreenTxt;
    }

    public String getOptionBlueUrl() {
        return optionBlueUrl;
    }

    public void setOptionBlueUrl(String optionBlueUrl) {
        this.optionBlueUrl = optionBlueUrl;
    }

    public String getOptionRedUrl() {
        return optionRedUrl;
    }

    public void setOptionRedUrl(String optionRedUrl) {
        this.optionRedUrl = optionRedUrl;
    }

    public String getOptionYellowUrl() {
        return optionYellowUrl;
    }

    public void setOptionYellowUrl(String optionYellowUrl) {
        this.optionYellowUrl = optionYellowUrl;
    }

    public String getOptionGreenUrl() {
        return optionGreenUrl;
    }

    public void setOptionGreenUrl(String optionGreenUrl) {
        this.optionGreenUrl = optionGreenUrl;
    }

    public int getCuestionario_id() {
        return cuestionario_id;
    }

    public void setCuestionario_id(int cuestionario_id) {
        this.cuestionario_id = cuestionario_id;
    }

    public Boolean getOptionBlue() {
        return optionBlue;
    }

    public void setOptionBlue(Boolean optionBlue) {
        this.optionBlue = optionBlue;
    }

    public Boolean getOptionRed() {
        return optionRed;
    }

    public void setOptionRed(Boolean optionRed) {
        this.optionRed = optionRed;
    }

    public Boolean getOptionYellow() {
        return optionYellow;
    }

    public void setOptionYellow(Boolean optionYellow) {
        this.optionYellow = optionYellow;
    }

    public Boolean getOptionGreen() {
        return optionGreen;
    }

    public int getNumPregunta() {
        return numPregunta;
    }

    public void setNumPregunta(int numPregunta) {
        this.numPregunta = numPregunta;
    }

    public void setOptionGreen(Boolean optionGreen) {
        this.optionGreen = optionGreen;
    }
}
