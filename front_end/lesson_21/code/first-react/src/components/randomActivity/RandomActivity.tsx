import { FC, useEffect, useState } from 'react';
// типы приходят из отдельного файла
import Activity from './types/Activity';
import MyButton from '../myButtom/MyButton';
// import cn from 'classnames'
// import styles from './RandomActivity.module.css'

const RandomActivity: FC = () => {
  const initialValue: Activity = {
    accessibility: 0,
    activity: '',
    key: '',
    link: '',
    participants: 0,
    price: 0,
    type: ''
  };

  const [activity, setActivity] = useState<Activity>(initialValue);

  // асинхронный запрос через try / catch
  async function loadActivity(): Promise<void> {
    const res = await fetch('https://www.boredapi.com/api/activity');
    const data = await res.json();
    setActivity(data);
  }
  // мы вызываем асинхронный запрос в useEffect()
  useEffect(() => {
    loadActivity();
  }, []);
  // кидаем запрос на на гугл, если нет ссылки в ответе API
  // https://www.google.com/search?q=earth
  // условие вывода прописываем тернарным оператором
  return (
    <div>
      <h1>RandomActivity</h1>
      <p>Попробуй: {activity.activity}</p>
      {/* не забывайте указывать знак вопроса, если обращаетесь к объекту с бека (вдруг он undefined) */}
      {/* {activity?.link && <p>Узнать больше: <a target="_blank" href={activity.link} rel="noreferrer"> */}
      {activity?.link ?
        (<p>Узнать больше: <a target="_blank" href={activity.link} rel="noreferrer">{activity.link}</a></p>) :
        (<a target="_blank" href={`https://www.google.com/search?q=${activity.activity}`} rel="noreferrer"><p>Искать в гугле</p></a>)}
      <MyButton onClick={loadActivity} text="Новая активность!" />
      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Provident repudiandae expedita voluptates voluptatum iure. Tempora cumque maiores accusamus sapiente explicabo placeat quia recusandae ipsam dolores labore id perspiciatis, voluptates harum.
        Debitis aliquam accusamus ipsa minus. Vero voluptatum incidunt illo? Rerum possimus quibusdam earum quaerat omnis? Quod numquam culpa exercitationem architecto. Exercitationem maiores error sit iste iusto pariatur, mollitia doloribus atque!
        Magnam exercitationem incidunt repudiandae ad voluptas tempore, doloribus quisquam eos nesciunt, fugiat quidem sed autem. Consectetur eaque excepturi nulla modi perferendis? Vel et earum recusandae! Tenetur esse repellat ipsum magnam.
        Iste quaerat magnam quibusdam amet debitis quidem ea cumque illum velit totam in laboriosam neque distinctio exercitationem, earum natus voluptas tenetur? Quo ad cum unde, aliquid quod minus iusto id?
        Dignissimos repellendus minima natus necessitatibus quia esse assumenda in error veritatis. Animi nulla obcaecati odio aperiam! Deleniti, odit enim? Iusto quaerat sunt quidem dolorem inventore dicta laboriosam delectus enim libero.
        Earum, perspiciatis a exercitationem, harum odio enim quisquam vel odit error deserunt quis cumque esse! Laborum illum quos aliquam iure libero nulla delectus inventore cumque, deleniti nam porro dolorum dolor.
        Voluptatum quibusdam doloribus repellendus ex unde totam, tempore minus dignissimos ipsa, labore, eius tenetur laudantium! Dolorem rem fuga possimus. Accusamus tempora esse beatae tempore sunt itaque doloribus nulla alias officiis.
        Molestias libero sequi iste exercitationem beatae expedita blanditiis eaque tempore. Culpa nesciunt eius, illo earum tenetur non sint provident corrupti cupiditate facilis vitae pariatur, dolorum molestiae, libero aspernatur labore. Officia.
        Magnam sunt optio reprehenderit, hic incidunt culpa saepe corrupti error quam et numquam aperiam quo, explicabo harum vel eum adipisci dolorum voluptas quia quidem suscipit earum omnis. Repudiandae, perspiciatis eveniet?
        Hic vitae tempore deleniti asperiores explicabo distinctio fuga magni, facilis voluptatibus architecto. Tempore dolores dicta accusamus delectus doloremque hic, maiores natus ratione quia possimus veritatis voluptate cumque sequi minus accusantium.
        Id, debitis nesciunt corporis quae incidunt veritatis sint repudiandae laudantium voluptate earum provident, illo odit repellat voluptatum error dolorum aut! Earum, assumenda fugiat. Perferendis dolorum culpa nesciunt voluptatum fugit possimus.
        Officia in similique porro, repudiandae quae deserunt ad tempora corrupti. Officia, sapiente cumque eaque natus recusandae molestias unde hic perspiciatis dolor obcaecati minus corrupti magnam alias ex dolorem velit atque.
        Nam reprehenderit perspiciatis modi officia numquam! Unde rem molestiae libero vero saepe illo. Quas sint, fugit eos quasi odit modi illum accusamus qui commodi corrupti temporibus ratione. Quo, nesciunt debitis!
        Quam inventore, incidunt error quis consequatur dignissimos dicta tempora deserunt eius recusandae, nostrum similique assumenda, culpa eos veritatis a fugit voluptates perspiciatis rem. Dolorum sequi nesciunt, exercitationem tenetur beatae mollitia.
        Quis libero necessitatibus fugiat consectetur adipisci velit ipsum debitis earum alias magni numquam ut ducimus, ipsam quidem soluta nostrum harum. Nobis officiis perspiciatis minus quia expedita ipsum similique, blanditiis voluptate.
        Magni dolorum voluptatem dolores similique, esse debitis eos? Sequi minus rem dicta explicabo unde similique nulla consequuntur at iste necessitatibus? Pariatur sint, eligendi alias sequi veniam eum asperiores odio qui!
        Tempora, laudantium. Incidunt pariatur tempore, at, dolor nostrum dicta, nobis illum rerum sed id fugiat reiciendis autem? Illum rerum autem quisquam, consequuntur aliquam saepe, numquam obcaecati explicabo excepturi nostrum nihil!
        Molestias iste odit aut id aliquid dignissimos provident quae aperiam ratione pariatur veniam sunt vel vero perferendis autem tempora, a, facere adipisci hic! Porro odio numquam id mollitia velit fugiat?
        Blanditiis est, tempore distinctio eum minima, vel odit temporibus ipsa alias, enim cum voluptates. Culpa doloremque hic esse earum accusamus, corporis corrupti atque nostrum aliquid animi tempore laborum? Adipisci, voluptatibus.
        Nulla, assumenda! Sapiente repellendus deleniti, modi asperiores aperiam illum, laudantium repudiandae libero aliquid deserunt corrupti nostrum quaerat aspernatur. Dolorum dolore dolorem facere alias mollitia modi quisquam nulla culpa repellendus totam?
        Adipisci laboriosam veritatis et repellendus expedita ad in natus officiis esse nulla sapiente veniam eum, eaque odio, mollitia delectus hic nihil amet velit perspiciatis deserunt porro tenetur quod. Quod, voluptas!
        Quae labore optio sint voluptates laborum quia, delectus aliquam unde laudantium quo enim! Consequuntur voluptatibus minima inventore iste soluta, nulla, eius ducimus sapiente quis similique debitis dolorum culpa id aliquid?
        Suscipit praesentium placeat sint, ad hic totam debitis aliquid, libero maxime voluptatibus perferendis dolore quod obcaecati dignissimos reprehenderit quia, omnis recusandae impedit mollitia asperiores ea non soluta aliquam! Quod, sint!
        Ullam maxime id necessitatibus beatae, alias assumenda tempore rem, iste expedita aspernatur vero architecto, qui perferendis quisquam! Voluptatum ad accusantium possimus harum, dolor facilis non, minima deleniti illo recusandae officia!
        Cum odio laudantium neque autem minus officiis maxime unde modi iste animi, maiores soluta praesentium magni? Dolores vel minima placeat. Omnis quidem nesciunt deserunt voluptatem. Explicabo quaerat impedit et veniam?
        Repellat, est! Modi, cupiditate consequatur dolores corrupti ea ullam quod iusto. Fuga mollitia inventore explicabo cupiditate autem pariatur reprehenderit facere laborum quisquam ea, blanditiis cumque architecto iste quos, quidem cum.
        Inventore eaque natus, maxime sed architecto illum quasi! Exercitationem ut molestias porro rerum temporibus, veniam optio quos neque tempora, est corporis eveniet velit perferendis deserunt. Non rerum incidunt fuga excepturi?
        Molestiae itaque quaerat illo a cupiditate quibusdam, esse debitis suscipit atque repudiandae, placeat repellendus reiciendis maiores iste velit, libero accusamus maxime possimus obcaecati fuga ex. Quis sapiente cum velit magni.
        Est mollitia esse maxime maiores corrupti voluptates alias quod perferendis pariatur possimus dolorum saepe dolores, aliquam corporis repellat quibusdam voluptas ea dolorem nostrum ab molestias sequi? Ad iste dolore veniam?
        Exercitationem, voluptatem? Illo perspiciatis minus dicta quia labore sed quae pariatur modi fuga vitae non nulla commodi harum illum debitis sequi magnam, dolores, optio alias. Animi inventore quod nihil quibusdam.
        Dolore ducimus vitae voluptatem minima veniam ex distinctio, dignissimos, eius cum expedita odio animi! Sunt nulla deleniti, reiciendis, quasi maiores corrupti voluptas quae dolor doloremque officiis deserunt non, debitis soluta?
        Facilis cupiditate quia excepturi blanditiis ex eligendi voluptatum cumque nihil illo delectus suscipit ipsa eaque modi qui dolores, voluptate, est eveniet deserunt, et dolorum necessitatibus numquam placeat eum. Dolor, dolorem.
        Dolore voluptates dignissimos sapiente tempore at nesciunt omnis expedita maiores velit dolorum ipsum nostrum perspiciatis veritatis magni, ex accusamus possimus ullam neque ducimus sunt et. Neque recusandae quo voluptatem quas?
        Libero nemo nesciunt, obcaecati quia recusandae quibusdam aliquam voluptates necessitatibus cumque, harum consectetur optio reiciendis ratione non minus magnam ipsam expedita ex omnis amet odio earum a ab. Rerum, harum!
        Nostrum soluta tempore corporis fugiat, asperiores libero velit. Error, nesciunt incidunt! Molestias voluptatibus similique perspiciatis, cumque veritatis beatae quae cupiditate neque blanditiis atque aliquid dolore porro tenetur necessitatibus. Iste, ipsum.
        Nihil saepe porro nostrum fugiat enim quisquam a facilis dolorem natus nisi nesciunt exercitationem, sunt aliquam, provident quas aliquid neque perferendis ducimus reprehenderit maiores minus! Iusto quia repudiandae error temporibus.
        Voluptatibus maiores earum quidem modi autem incidunt, placeat perspiciatis laboriosam dolore minus eveniet magnam ad odit tenetur recusandae repellat accusamus blanditiis minima aliquam velit. Nemo necessitatibus dolorum iusto mollitia deserunt!
        Minima, velit provident laudantium blanditiis, aliquid, nobis sint vel doloremque perspiciatis non officiis ex hic et? Nemo optio quasi ab molestias. Ipsum deleniti doloribus quidem quisquam ipsa fugiat impedit natus?
        Nisi nostrum eligendi quibusdam quo natus nulla dolore sit aperiam ratione numquam similique dicta officiis cumque voluptatum, expedita quos voluptate iste obcaecati mollitia. Quam atque eligendi in expedita quia officiis?
        Quae voluptatem perferendis animi nisi eum quisquam culpa commodi alias veritatis deserunt? Dolore quidem non rerum, fuga consequatur quae, cumque consequuntur possimus magnam facilis dolorum. Consequatur maiores asperiores quibusdam dolores.
        Debitis, quidem in praesentium voluptates placeat ad? Veniam natus quae, dolores pariatur deleniti culpa quaerat odio placeat dolorem iusto. Aliquid error adipisci ad possimus tenetur distinctio molestias ullam laboriosam provident!
        Impedit ad dolore nam deserunt harum iusto dicta, molestias id exercitationem ipsum, omnis hic reiciendis sint atque sed earum reprehenderit quam quibusdam quia nisi assumenda. Incidunt quam nobis cupiditate sapiente.
        Iure iste tempore aliquam eligendi aliquid et nesciunt molestiae officiis ducimus, pariatur, doloribus dolor nulla porro dolorem neque delectus fuga dolore tempora perspiciatis provident ab? Dolores delectus nemo sit harum.
        Doloribus exercitationem perspiciatis illo magni distinctio voluptatem ducimus modi ipsa molestiae reprehenderit aspernatur id quisquam, facere numquam repellendus omnis fugit ea in quasi non, iusto nisi nesciunt possimus? Iusto, vero.
        Dolorem possimus repellendus iste fugit facilis veniam quidem velit eos itaque perferendis? Impedit rerum fugiat, delectus rem dicta temporibus exercitationem ad! Velit eum possimus reprehenderit, maiores assumenda placeat provident saepe?
        Maxime atque at rem repellat asperiores accusamus commodi delectus obcaecati, dicta voluptates adipisci necessitatibus tempora voluptatem consequatur eaque eius vitae sit aperiam soluta omnis molestias assumenda facilis harum quos. Corrupti.
        Accusantium magni inventore doloribus labore velit voluptas aliquam necessitatibus rerum, modi dicta similique ipsa a, doloremque amet optio. Vel, id odio incidunt ipsa non quidem praesentium. Commodi beatae rerum eos?
        In nulla fugit expedita velit inventore? Esse optio nostrum quae reiciendis voluptatibus, vitae, ipsa omnis, ducimus assumenda aut ipsam eos illo alias. Nesciunt expedita at veniam, libero repellat dolore. Assumenda.
        Beatae quas modi recusandae. Sunt vitae dolores, minus temporibus debitis deserunt eius labore quis distinctio possimus voluptates sapiente sed molestiae illo, aperiam sint voluptatum suscipit id. Tempora voluptatem facere minima?
        Vel accusantium doloremque porro ipsum, maiores fuga ducimus dicta debitis minima laboriosam at quo dolorum minus, iure voluptatum itaque animi quam esse aliquid hic quisquam dolore! Vel, ex! Aperiam, distinctio.
        Rerum dolor eveniet atque magni. Ullam fugit quidem mollitia ex laudantium est sequi animi similique cum dolores quam natus, delectus modi libero! Repellat porro corporis maxime cumque dolore iure debitis?
        Ullam corporis voluptas voluptatem reiciendis odio facilis ratione delectus iste tempora cum. Voluptates similique possimus quas fugit, mollitia dicta perferendis, cupiditate id, consequatur enim quis iure facilis iusto neque asperiores.
        Corporis harum nulla dolores possimus fugit dignissimos officiis eveniet similique ad voluptate magnam ratione minus, perferendis sequi, repellat nesciunt amet soluta nostrum, cumque impedit repudiandae? In odio quisquam perspiciatis inventore?
        Est neque minima voluptates voluptatibus ad? Eum aliquam veritatis ipsum provident a aliquid, itaque inventore incidunt explicabo in architecto nihil ut eius perspiciatis nemo autem sit nulla dolor maxime possimus.
        Asperiores corrupti esse quo ipsum quod ducimus, numquam velit earum molestias minus vel similique unde. Accusamus excepturi sapiente saepe minima pariatur eius totam quam? Minima distinctio iusto velit ea ratione?
        Voluptatem minus provident eligendi quae rem harum molestiae, culpa corrupti atque reprehenderit ad repellat illum nesciunt quaerat quo non sint ullam amet architecto nulla adipisci esse. Eveniet dolor quae fugiat!
        Adipisci illo totam aspernatur ut voluptates vel, perferendis laboriosam tenetur saepe obcaecati illum reiciendis? Officia molestias eum exercitationem magni laborum itaque neque laboriosam omnis officiis! Dolorem asperiores ex sequi expedita.
        Consectetur, rem! Aperiam, laboriosam corrupti unde vero inventore eum eveniet autem magnam! Ea consequatur laborum tempora neque commodi voluptate itaque nam eligendi libero ad, recusandae assumenda! Animi ipsa inventore ad!
        Error perspiciatis quibusdam, aliquid recusandae dolor at nisi tempore officia ab rerum sapiente consequatur doloribus dicta, accusamus nostrum ea porro neque debitis mollitia quia magni, necessitatibus magnam? Cum, similique ratione!
        Quidem, corrupti perferendis! Aperiam suscipit dolorem dolores ducimus ratione, quisquam aspernatur sapiente ea. Incidunt nobis eligendi distinctio voluptate autem quibusdam ipsa, corrupti dolores esse earum delectus asperiores, unde illum aliquid?
        Et dolor vitae vel aut veniam quas, minima officiis enim tempore laboriosam illum voluptas rerum voluptatem nostrum doloribus, delectus odio? Eligendi necessitatibus sit qui sequi commodi, nostrum laboriosam autem ipsa!
        Id culpa atque dicta cupiditate earum aut, maiores fuga doloremque aliquam impedit illum distinctio consectetur repellat ipsa est eligendi sapiente provident quia ipsum, eveniet in architecto nemo. Enim, hic maiores!
        Maiores vitae nobis quisquam non tenetur itaque enim repellat molestias voluptas inventore sapiente voluptatibus tempore a facere, consequatur, qui recusandae rem eligendi expedita iure iste eum earum. Quas, aliquid perspiciatis!
        Laborum, accusamus! Minus, reiciendis, illo rem natus necessitatibus dolores assumenda in recusandae voluptatem laborum eveniet. Sequi fuga, ipsum officiis eum, minima dolor maxime molestiae minus dicta cumque nesciunt, pariatur at.
        In architecto id harum magnam totam natus excepturi veniam consectetur eaque dolorum? Magnam temporibus vero voluptate perferendis deserunt, delectus excepturi id, laudantium numquam velit rem laborum recusandae. Provident, nemo quasi?
        Similique vitae quae fuga animi eum recusandae dolorem blanditiis, minima temporibus totam, sapiente mollitia est qui molestiae cum facilis quasi tempora rerum soluta consequatur, non deleniti explicabo pariatur eaque. Doloremque?
        Expedita non incidunt quia corrupti quis quidem officia debitis porro obcaecati perspiciatis, blanditiis voluptate, enim eius magnam dolorem quod consectetur illum laborum. Dolorum, nobis asperiores quisquam nulla sint molestiae sed.
        Nemo non inventore at omnis enim repellat! Accusamus dolorem alias in molestias non aliquid eligendi velit quod facere tenetur, totam nihil nemo quasi dolores nam, aliquam, ratione cupiditate rem adipisci!
        Excepturi at repellendus, quae mollitia dignissimos labore hic tempore aspernatur dolore, ipsum quod atque laborum! Iure voluptate eaque voluptas sunt unde placeat ex nam delectus magnam qui, minima, pariatur quidem?
        Deleniti officiis nesciunt nisi saepe similique, iste debitis hic repellat dolores culpa mollitia, alias quisquam minus illo exercitationem doloribus quas deserunt cupiditate magni praesentium! Fugit doloremque sequi voluptatibus quibusdam? Sapiente!
        Necessitatibus laboriosam eius, consectetur quibusdam sequi non a. Laudantium voluptates illum nihil omnis nam esse sequi, nobis beatae cupiditate saepe dicta. Consequatur eveniet ab autem aperiam recusandae aut eius facilis?
        Sed, recusandae ipsum perspiciatis omnis sequi minus! Maxime saepe illo, culpa, maiores voluptatem magnam corrupti aliquid eius vero quae dignissimos vitae qui ab, asperiores voluptas laboriosam blanditiis reprehenderit. Ullam, facere!
        Ducimus cupiditate ipsum quos at laboriosam quasi. Pariatur eius recusandae aut officiis, obcaecati odio accusantium libero culpa, cum voluptatem est repellat consectetur nam, commodi blanditiis repellendus minus delectus eaque id!
        Doloremque quis accusamus laudantium iusto unde itaque aperiam quisquam soluta neque! Corporis reprehenderit sequi consectetur enim recusandae veritatis saepe autem, iusto nobis tempore! Veritatis, cum recusandae ad aperiam aspernatur ullam.
        Libero illum error magnam fugiat tempore distinctio mollitia blanditiis quidem hic corrupti voluptatibus odit esse similique quae aperiam architecto asperiores, quibusdam ab nihil optio tenetur dicta eveniet explicabo molestias. Natus.
        Cupiditate accusamus, velit autem ipsam perferendis necessitatibus mollitia consequuntur eos, dolore quod illo corrupti alias praesentium officiis vero eaque distinctio. Pariatur ab assumenda nobis vero optio maiores consectetur ea neque.
        Minus quas reiciendis totam, animi, a cumque maiores perspiciatis harum dolorum odit provident pariatur unde dignissimos ullam eligendi rerum excepturi iure nam earum? Sequi ad eligendi minima totam blanditiis. Eos.
        Animi minus, id in eaque laboriosam quis commodi eum quidem ab possimus quas pariatur at aliquam tempore nostrum assumenda nobis nulla doloribus amet officiis obcaecati itaque inventore iusto! Cupiditate, ipsam.
        Sapiente rem, voluptatem ea sunt quaerat fugiat quos mollitia quis veniam, fugit eveniet inventore enim, ad excepturi molestiae tempore alias maiores nisi molestias officia voluptatibus praesentium quo dolore? Ducimus, non.
        Illum similique magni delectus fuga veritatis nemo maxime quidem ipsa, officiis minus, modi vero sequi alias dignissimos consequatur quae eligendi, quisquam quod. Nulla distinctio laudantium amet quos. Ducimus, nemo repudiandae!
        Officiis voluptas laborum corporis illum quas enim tempore excepturi a architecto tempora. Ex, quae nesciunt? Nobis quisquam, voluptatibus alias modi magni deleniti, ducimus voluptate consectetur ipsum reprehenderit aspernatur error minus?
        Impedit recusandae corporis optio perspiciatis officiis nisi debitis sequi qui molestiae, aspernatur quae nobis modi eaque dicta sed ex aperiam veniam excepturi nesciunt? Aut dolore tempore deserunt optio nemo dignissimos.
        Debitis, qui. Pariatur exercitationem quo numquam iure voluptates architecto odit beatae porro nemo sint. Quae ipsa amet quaerat blanditiis? Voluptates sint consectetur ab quas laudantium suscipit quo praesentium voluptate velit?
        Eligendi facere omnis recusandae placeat ducimus rerum impedit cumque, molestias velit odit amet reiciendis vero deserunt eaque ab earum excepturi architecto deleniti maiores, delectus expedita modi neque voluptates? Dignissimos, sint.
        Libero rerum aspernatur porro corrupti, adipisci magnam repellat nesciunt beatae quam sapiente corporis. Illum provident vitae, sequi aspernatur impedit ipsum quis animi libero assumenda autem neque voluptas, illo, pariatur eius.
        Fuga iusto cum harum provident excepturi architecto cumque, placeat asperiores? Itaque animi dolores quasi quam molestias nihil distinctio perspiciatis laborum perferendis sint repellendus asperiores excepturi ducimus, sequi consequatur eveniet tempore!
        Dolorem, qui perferendis porro, pariatur earum labore iusto vel voluptatum voluptatem, sit veniam necessitatibus eaque sunt numquam incidunt inventore ipsam dolore! Reiciendis vero dolor nesciunt sapiente neque doloribus voluptatibus facere?
        Possimus adipisci culpa aspernatur ad velit fuga voluptate, dignissimos veniam error laudantium doloremque minima ex veritatis ullam nobis excepturi perferendis quibusdam rem impedit. Totam, doloremque optio quia possimus aperiam porro.
        Inventore autem, ratione eius culpa fuga error nobis ad eaque expedita beatae voluptate similique totam adipisci laborum, odit libero, porro earum! Cumque quae ad ipsam dicta, eos libero ipsa. Laborum.
        Officia expedita dicta animi perferendis? Temporibus consequatur a eos. Nobis magnam veritatis dolores fugit eos vitae ipsum atque libero tempore, corporis unde ab tempora, ut rem? Omnis necessitatibus consequatur labore.
        Nemo, quod esse voluptatibus iste commodi culpa veritatis rerum doloremque maiores incidunt inventore ipsam enim facere, ipsum consequatur sequi unde vero nostrum placeat. Aspernatur commodi ratione quas itaque dolorem maxime.
        Quam quis neque vero blanditiis earum esse, suscipit doloremque ea est facilis similique odio consequatur fugiat! Unde consectetur nobis iste, accusamus tenetur, consequuntur eaque eveniet delectus commodi saepe eius blanditiis.
        Incidunt quasi aspernatur sapiente, fugit inventore quas quam consequuntur placeat ad ex vitae nesciunt maxime nobis voluptas a itaque quod commodi quos sunt dolore optio? Provident possimus repellat ad fugiat.
        Libero voluptates illo ducimus cum rem nisi architecto aliquid quibusdam odio, voluptatibus iste vitae quam itaque illum a nostrum suscipit nihil autem totam sit debitis eum, doloremque possimus. Eos, debitis.
        Ullam illo deserunt incidunt velit officia ipsum blanditiis repellendus, ex facilis quisquam a in, quibusdam mollitia minima cum autem nemo nulla aperiam ratione voluptatum commodi? Aliquid laborum distinctio numquam enim.
        Quasi impedit laboriosam molestias ex cum laudantium obcaecati tenetur labore commodi corporis temporibus earum aspernatur delectus ut aliquid sapiente dolorum a, rem minima, placeat nam quae repudiandae! Autem, cumque debitis.
        Adipisci esse tempore unde, cupiditate, neque eaque, sit exercitationem rem quos minima sequi aliquam placeat delectus facilis maxime laudantium labore nam sunt ipsa necessitatibus doloribus quis animi! Error, dignissimos excepturi.
        Temporibus molestias corporis voluptatibus illum quidem neque velit sint repellat architecto voluptates qui voluptate, corrupti illo? Quaerat laboriosam aliquam mollitia nemo illo odio repudiandae incidunt, suscipit nobis nesciunt. Mollitia, harum?
        Ullam, in, incidunt sed saepe nisi voluptatum quam ab magnam at ducimus quidem dolore nulla et tempore dicta natus, officiis porro a. Eligendi suscipit nulla voluptatum voluptas, iusto unde laboriosam.
        Architecto necessitatibus voluptas sapiente animi porro! Natus maxime, nostrum neque itaque ducimus magnam aperiam nisi fugiat expedita, temporibus, totam quas laboriosam iusto perferendis sed dolore ipsum cumque molestias sequi quia.
      </p>
    </div>
  );
};

export default RandomActivity;
