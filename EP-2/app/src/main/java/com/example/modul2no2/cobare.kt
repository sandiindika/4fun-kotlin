package com.example.modul2no2

import android.os.Parcel
import android.os.Parcelable

data class cobare(val image:Int, val name:String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }
    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<cobare> {
        override fun createFromParcel(parcel: Parcel): cobare {
            return cobare(parcel)
        }
        override fun newArray(size: Int): Array<cobare?> {
            return arrayOfNulls(size)
        }
    }
}
