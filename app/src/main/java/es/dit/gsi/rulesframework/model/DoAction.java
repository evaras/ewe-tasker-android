package es.dit.gsi.rulesframework.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by afernandez on 14/12/15.
 */
public class DoAction implements Parcelable{
    private String name;
    private String paramType;

    public DoAction(){

    }

    public DoAction(String name, String paramType) {
        this.name = name;
        this.paramType = paramType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    //Parcelable
    public DoAction(Parcel in){
        String[] data = new String[3];

        in.readStringArray(data);
        this.name = data[0];
        this.paramType = data[1];
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[] {this.name, this.paramType});
    }

    public static final Creator<DoAction> CREATOR = new Creator<DoAction>() {
        @Override
        public DoAction createFromParcel(Parcel in) {
            return new DoAction(in);
        }

        @Override
        public DoAction[] newArray(int size) {
            return new DoAction[size];
        }
    };
}