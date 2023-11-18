//
//  ViewController.swift
//  RestaurantRater
//
//  Created by user236797 on 4/4/23.
//

import UIKit
import CoreData

class ViewController: UIViewController {
    
    @IBOutlet weak var restaurantTextField: UITextField!
    @IBOutlet weak var addressTextField: UITextField!
    var restaurantObjectID: NSManagedObjectID?
    
    let context = (UIApplication.shared.delegate as! AppDelegate).persistentContainer.viewContext
    
    @IBAction func rateDishTapped(_ sender: Any) {
        let restaurant = Restaurant(context: context)
        restaurant.name = restaurantTextField.text
        restaurant.address = addressTextField.text
        
        do {
            try context.save()
            restaurantObjectID = restaurant.objectID
        } catch {
            print("Didn't save due to \(error)")
        }
        
        performSegue(withIdentifier: "getDataSegue", sender: self)
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if segue.identifier == "getDataSegue" {
            let destinationVC = segue.destination as! RatingViewController
            destinationVC.restaurantObjectID = restaurantObjectID
        }
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
}

