import Entities.Player;

import Adapter.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		Player player = new Player(1,"Murat","Özer","11111111",new Date(2001,31,3),"Murat","murat@gmail.com");
		
		Game game = new Game(1, "CS:GO", "Savaþ Oyunu", 120);
		
		Campaign campaign = new Campaign(1, "Firsat ürünü", "Kampanya detay");
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player);
		playerManager.update(player);
		playerManager.delete(player);
		
		GameManager gameManager = new GameManager();
		
		gameManager.addCampaing(game, campaign);
		gameManager.sellGame(game, player);
		gameManager.updateCampaign(game, campaign);
		gameManager.deleteCampaign(game, campaign);
	}

}
