/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

/**
 *
 * @author srikr
 */
public class Encounter extends Person{
    private String name;
    private int encounter;
    private String doctorName;
    private Vital vital;


    public int getEncounter() {
        return encounter;
    }

    public void setEncounter(int encounter) {
        this.encounter = encounter;
    }

    public Vital getVital() {
        return vital;
    }

    public void setVital(Vital vital) {
        this.vital = vital;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
