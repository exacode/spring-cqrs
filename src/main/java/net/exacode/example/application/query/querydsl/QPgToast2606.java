package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2606 is a Querydsl query type for QPgToast2606
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2606 extends com.mysema.query.sql.RelationalPathBase<QPgToast2606> {

    private static final long serialVersionUID = -8643338;

    public static final QPgToast2606 pgToast2606 = new QPgToast2606("pg_toast_2606");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast2606> pgToast2606Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast2606(String variable) {
        super(QPgToast2606.class, forVariable(variable), "pg_toast", "pg_toast_2606");
    }

    @SuppressWarnings("all")
    public QPgToast2606(Path<? extends QPgToast2606> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2606");
    }

    public QPgToast2606(PathMetadata<?> metadata) {
        super(QPgToast2606.class, metadata, "pg_toast", "pg_toast_2606");
    }

}

