//
//  RatingViewController.swift
//  RestaurantRater
//
//  Created by user236797 on 4/5/23.
//

import UIKit
import CoreData

class RatingViewController: UIViewController {
    
    
    @IBOutlet weak var dishTextField: UITextField!
    @IBOutlet weak var dishTypeTextField: UITextField!
    @IBOutlet weak var ratingSegmentedControl: UISegmentedControl!
    var restaurantObjectID: NSManagedObjectID?
    
    let context = (UIApplication.shared.delegate as! AppDelegate).persistentContainer.viewContext
    
    
    
    @IBAction func saveButtonTapped(_ sender: Any) {
        guard let restaurantID = restaurantObjectID else {
            return
        }
        print("attempting save")
        let dish = Dish(context: context)
        dish.name = dishTextField.text
        dish.type = dishTypeTextField.text
        dish.rating = Int16(ratingSegmentedControl.selectedSegmentIndex+1)
        do {
            let restaurant = try context.existingObject(with: restaurantID) as! Restaurant
            dish.restaurant = restaurant
            try context.save()
        } catch {
            print("Dish save fail \(error)")
        }
        navigationController?.popViewController(animated: true)
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
