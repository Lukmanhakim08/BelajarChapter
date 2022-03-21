package lu.andlim.belajarchapter3.Serializable.latihankedua

import android.os.Parcel
import android.os.Parcelable

data class dataLuas (val panjang: Int, val lebar: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(panjang)
        parcel.writeInt(lebar)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<dataLuas> {
        override fun createFromParcel(parcel: Parcel): dataLuas {
            return dataLuas(parcel)
        }

        override fun newArray(size: Int): Array<dataLuas?> {
            return arrayOfNulls(size)
        }
    }
}