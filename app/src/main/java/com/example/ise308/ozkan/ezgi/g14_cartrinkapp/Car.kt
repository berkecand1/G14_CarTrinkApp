package com.example.ise308.ozkan.ezgi.g14_cartrinkapp

import android.media.Image
import android.net.Uri
import android.widget.ImageView
import java.net.URI
import org.json.JSONException
import org.json.JSONObject
import java.util.*

class Car {


    var modelName: String? = null
    var brandName: String? = null
    var fuelType: String? = null
    var km: Double? = null
    var price: Double? = null
    var color: String? = null
    var listingDate: Date? = null
    var status: Boolean? = null
    var image: Uri? = null
    var transmission: String? = null
    var gearType: String? = null


    private val JSON_MODELNAME = "modelName"
    private val JSON_BRANDNAME = "brandName"
    private val JSON_FUELTYPE = "fuelType"
  //  private val JSON_KM = "km"
  //  private val JSON_PRICE = "price"
    private val JSON_COLOR = "color"
    //private val JSON_IMAGE = "image"
    private val JSON_GEARTYPE = "gearType"


    @Throws(JSONException::class)
    constructor(jo: JSONObject) {

        modelName = jo.getString(JSON_MODELNAME)
        brandName = jo.getString(JSON_BRANDNAME)
        fuelType = jo.getString(JSON_FUELTYPE)
    //    km = jo.getDouble(JSON_KM)
    //    price = jo.getDouble(JSON_PRICE)
        color = jo.getString(JSON_COLOR)
//      image = jo.getString(JSON_IMAGE) as Uri
       
        gearType = jo.getString(JSON_GEARTYPE)



    }

    constructor(){

    }

    @Throws(JSONException::class)
    fun convertToJson() : JSONObject {

        val jo = JSONObject()

        jo.put(JSON_MODELNAME,modelName)
        jo.put(JSON_BRANDNAME,brandName)
        jo.put(JSON_FUELTYPE,fuelType)
     //   jo.put(JSON_KM,km)
     //   jo.put(JSON_PRICE,price)
        jo.put(JSON_COLOR,color)
        //    jo.put(JSON_IMAGE,image)
        jo.put(JSON_GEARTYPE,gearType)

        return jo
    }




}