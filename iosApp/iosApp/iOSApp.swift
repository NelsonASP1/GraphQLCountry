import SwiftUI
import shared

@main
struct iOSApp: App {
    
    init(){
        SetupKoinKT.doInitKoin()
    }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
