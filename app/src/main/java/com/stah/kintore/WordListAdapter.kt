package com.stah.kintore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class WordListAdapter(context: Context, list: List<String>) :
    RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    val inflater = LayoutInflater.from(context)

    val wordList = list

    class WordViewHolder(itemView: View, val adapter: WordListAdapter) :
        RecyclerView.ViewHolder(itemView) {

        lateinit var wordView: TextView
        lateinit var adapterList: WordListAdapter

        init {
            wordView = itemView.findViewById<TextView>(R.id.word)
            adapterList = adapter
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {

        val itemView = inflater.inflate(R.layout.wordlist_item, parent, false)

        return WordViewHolder(itemView, this)

    }

    override fun getItemCount(): Int {
        return wordList.size
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {

        val mCurrent = wordList.get(position);
        holder.wordView.setText(mCurrent);

    }

}