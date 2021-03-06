package com.example.recyclerviewdemo

class Contact(
    val name:String,
    val isOnline:Boolean
){
   companion object{
       private var lastContactId = 0
       fun createContactList(numContacts: Int) : ArrayList<Contact> {
           val contacts = ArrayList<Contact>()
           for (i in 1..numContacts) {
               contacts.add(Contact("person" + ++lastContactId, i <= numContacts / 2))
           }
            return contacts
       }
   }
}