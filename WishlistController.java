import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wishlists")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @GetMapping
    public List<WishlistItem> getUserWishlist() {
        return wishlistService.getUserWishlist();
    }

    @PostMapping
    public WishlistItem createWishlistItem(@RequestBody WishlistItem wishlistItem) {
        return wishlistService.createWishlistItem(wishlistItem);
    }

    @DeleteMapping("/{id}")
    public void deleteWishlistItem(@PathVariable Long id) {
        wishlistService.deleteWishlistItem(id);
    }
}
