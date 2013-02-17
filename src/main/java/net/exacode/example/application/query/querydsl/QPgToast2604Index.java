package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2604Index is a Querydsl query type for QPgToast2604Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2604Index extends com.mysema.query.sql.RelationalPathBase<QPgToast2604Index> {

    private static final long serialVersionUID = -1169419202;

    public static final QPgToast2604Index pgToast2604Index = new QPgToast2604Index("pg_toast_2604_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast2604Index(String variable) {
        super(QPgToast2604Index.class, forVariable(variable), "pg_toast", "pg_toast_2604_index");
    }

    @SuppressWarnings("all")
    public QPgToast2604Index(Path<? extends QPgToast2604Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2604_index");
    }

    public QPgToast2604Index(PathMetadata<?> metadata) {
        super(QPgToast2604Index.class, metadata, "pg_toast", "pg_toast_2604_index");
    }

}

