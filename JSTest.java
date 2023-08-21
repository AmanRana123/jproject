// Step 1: Create a variable to hold your NFT's
const nftCollection = [];

// Step 2: This function will take in some values as parameters, create an
// NFT object using the parameters passed to it for its metadata,
// and store it in the variable above.
function mintNFT(name, description, rarity) {
    const nft = {
        name: name,
        description: description,
        rarity: rarity
    };
    nftCollection.push(nft);
}

// Step 3: Create a "loop" that will go through an "array" of NFT's
// and print their metadata with console.log()
function listNFTs() {
    for (const nft of nftCollection) {
        console.log("Name: " + nft.name);
        console.log("Description: " + nft.description);
        console.log("Rarity: " + nft.rarity);
        console.log("-----------");
    }
}

// Step 4: Print the total number of NFTs we have minted to the console
function getTotalSupply() {
    return nftCollection.length;
}

// Call your functions below this line

mintNFT("NFT 1", "Description of NFT 1", "Common");
mintNFT("NFT 2", "Description of NFT 2", "Rare");
mintNFT("NFT 3", "Description of NFT 3", "Legendary");

listNFTs();

console.log("Total NFTs minted: " + getTotalSupply());
