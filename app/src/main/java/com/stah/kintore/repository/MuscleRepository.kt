package com.stah.kintore.repository

interface MuscleRepository {
    //ここでmodelを受け取り、保存する
    fun save()

    // モデルを取り出す
    fun load()

    class DefaultMuscleRepository : MuscleRepository {
        override fun save() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun load() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}