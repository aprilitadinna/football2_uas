package app.bola.kotlin.feature.team.player

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.bola.kotlin.R
import app.bola.kotlin.model.Constant
import app.bola.kotlin.model.vo.PlayerVo
import kotlinx.android.synthetic.main.fragment_player_overview.view.*
import org.jetbrains.anko.support.v4.ctx

class PlayerOverviewFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(ctx).inflate(R.layout.fragment_player_overview, container, false)
        val player: PlayerVo? = arguments?.getParcelable(Constant.PLAYER_INTENT)
        view.tv_player_height.text = player?.height?.split(" ")?.first() ?: "0"
        view.tv_player_weight.text = player?.weight?.split(" ")?.first() ?: "0"
        view.tv_player_position.text = player?.position
        view.tv_player_description.text = player?.description
        return view
    }
}