package com.example.lab5intent_603020791_7

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
 data class Student (val id:String, val name: String, val age: Int) : Parcelable {
}