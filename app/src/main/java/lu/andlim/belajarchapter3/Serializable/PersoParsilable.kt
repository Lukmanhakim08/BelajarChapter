package lu.andlim.belajarchapter3.Serializable

import android.os.Parcel
import android.os.Parcelable
import android.provider.ContactsContract

data class PersoParsilable(val name: String?, val email: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(email)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersoParsilable> {
        override fun createFromParcel(parcel: Parcel): PersoParsilable {
            return PersoParsilable(parcel)
        }

        override fun newArray(size: Int): Array<PersoParsilable?> {
            return arrayOfNulls(size)
        }
    }
}