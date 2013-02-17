package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAmopFamStratIndex is a Querydsl query type for QPgAmopFamStratIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAmopFamStratIndex extends com.mysema.query.sql.RelationalPathBase<QPgAmopFamStratIndex> {

    private static final long serialVersionUID = 797492664;

    public static final QPgAmopFamStratIndex pgAmopFamStratIndex = new QPgAmopFamStratIndex("pg_amop_fam_strat_index");

    public final NumberPath<Long> amopfamily = createNumber("amopfamily", Long.class);

    public final NumberPath<Long> amoplefttype = createNumber("amoplefttype", Long.class);

    public final NumberPath<Long> amoprighttype = createNumber("amoprighttype", Long.class);

    public final NumberPath<Short> amopstrategy = createNumber("amopstrategy", Short.class);

    public QPgAmopFamStratIndex(String variable) {
        super(QPgAmopFamStratIndex.class, forVariable(variable), "pg_catalog", "pg_amop_fam_strat_index");
    }

    @SuppressWarnings("all")
    public QPgAmopFamStratIndex(Path<? extends QPgAmopFamStratIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_amop_fam_strat_index");
    }

    public QPgAmopFamStratIndex(PathMetadata<?> metadata) {
        super(QPgAmopFamStratIndex.class, metadata, "pg_catalog", "pg_amop_fam_strat_index");
    }

}

