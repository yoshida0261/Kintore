package com.stah.kintore.repository

import com.stah.kintore.model.Traning

interface MuscleRepository {
    //ここでmodelを受け取り、保存する
    fun save()

    // モデルを取り出す
    fun load() : List<Traning>
    val listRepository : List<Traning>

    companion object{
        private var instance : MuscleRepository? = null

        fun getInstance() : MuscleRepository = instance ?: DefaultMuscleRepository().also {
            instance = it
        }
    }


    class DefaultMuscleRepository : MuscleRepository {

        override val listRepository: List<Traning>
            get() = load()

        override fun save() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun load() : List<Traning>{
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}