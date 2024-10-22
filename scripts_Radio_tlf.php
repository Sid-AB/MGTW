<?php 

$host = 'localhost'; // or your database server
$username = 'root';
$password = '';
$database = 'amg';

// Create a new MySQLi connection
$connection = new mysqli($host, $username, $password, $database);

// Check if the connection was successful
if ($connection->connect_error) {
    // Handle connection error
    die('Connection failed: ' . $connection->connect_error);
}
$i=0;
$final=[];
$rq="SELECT radio_id from caracteristique ";
$stmt=$connection->prepare($rq);
$stmt->execute();
$result=$stmt->get_result();

while($row = $result->fetch_assoc())
{
$final[$i]['radio_id']=$row['radio_id'];
$i++;
}
for($i =0 ;$i< count($final);$i++){
$rq='UPDATE `caracteristique` SET `polarization`="Horizontal" WHERE radio_id = ?';
$id=$final[$i]['radio_id'];
$stmt=$connection->prepare($rq);
$stmt->bind_param('i', $id);
$stmt->execute();
}
$i=0;
$final=[];
$rq="SELECT phone,fax,id FROM radio";
$stmt=$connection->prepare($rq);
$stmt->execute();
$result=$stmt->get_result();

while($row = $result->fetch_assoc())
{
$final[$i]['id']=$row['id'];
$final[$i]['phone']=$row['phone'];
$final[$i]['fax']=$row['fax'];
$i++;
}

//print_r($final);
for($i =0 ;$i< count($final);$i++)
{
    $phone=$final[$i]['phone'];
    $fax=$final[$i]['fax'];
    $id=$final[$i]['id'];
    $newphone=explode("0",$phone);
    $newfax=explode("0",$fax);
    if(isset( $newphone))
    {
    $addphone="+213 ".$newphone[1];
    }
    else
    {
        $addphone=$final[$i]['phone'];
    }
    if(isset($newfax))
    {
    $addfax="+213 ".$newfax[1];
    }
    else
     {
        $addfax=$final[$i]['fax'];
     }
    $rq='UPDATE `radio` SET `fax`= ? ,`phone`= ? WHERE id = ?';
    $stmt=$connection->prepare($rq);
    $stmt->bind_param('ssi',$addfax,$addphone, $id);
    $stmt->execute();
    print_r($addfax."\n");
}
    /*$id=$final[56]['phone'];
    $new=explode("0",$id);
    $add="+213 ".$new[1];
    print_r($add);*/
   /* $stmt=$connection->prepare($rq);
    $stmt->bind_param('i', $id);
    $stmt->execute();*/
    
?>