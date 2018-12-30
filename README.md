#Model-View-ViewModel

- The View — that informs the ViewModel about the user’s actions
- The ViewModel — exposes streams of data relevant to the View
- The DataModel — abstracts the data source. The ViewModel works with the DataModel to get and save the data.

--------------------------------------------------------------------------------------------------------------------------

![Flow 1](https://github.com/mksantoki/MVVMDEMO/blob/master/img/step_one.png)

###### Flow 1

- View -> View will your activity or fragment
- ViewModel -> ViewModel is use to transfer data between view and datamodel
- DataModel -> Datamodel is use to perform business login
- Model -> Mode class is structure of data 

![Flow 2](https://github.com/mksantoki/MVVMDEMO/blob/master/img/step_two.png)

-> View (Activity/Fragment) request to viewmodel. Viewmodel request to repository. repository request data acording requirement like offline data and online data. Offline data (Model) means database or static data. Remote data means api calls and other online data storage.
